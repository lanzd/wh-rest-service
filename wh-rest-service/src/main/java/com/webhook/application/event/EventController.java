package com.webhook.application.event;

import com.google.gson.JsonObject;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/connector/{connector}/event")
public class EventController {

    @Autowired
    EventService eventService;

    @RequestMapping(method = RequestMethod.POST)
    public Event newEvent(@PathVariable("connector") long connectorId, @RequestBody JsonObject jsonObject) throws NotFoundException {
        return eventService.newEvent(connectorId,jsonObject);
    }

}
