package com.webhook.application.event;

import com.google.gson.JsonObject;
import com.webhook.application.connector.Connector;
import com.webhook.application.connector.ConnectorService;
import com.webhook.application.handler.EventHandler;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    ConnectorService connectorService;

    @Autowired
    EventRepository eventRepository;

    @Autowired
    EventHandler eventHandler;

    public Event newEvent(long connectorId, JsonObject jsonObject) throws NotFoundException {
        Connector connector = connectorService.get(connectorId);
        Event event = eventRepository.insert(createTemp(connector,jsonObject));

        //shootEvent
        EventHandler.handle(event);

        return event;
    }


    public Event createTemp(Connector connector, JsonObject jsonObject){
        Event event = new Event();
        event.setConnector(connector);
        event.setJson(jsonObject);
        return event;
    }

}
