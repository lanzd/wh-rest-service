package com.webhook.application.transformedevent;

import com.google.gson.JsonObject;
import com.webhook.application.event.Event;

import javax.persistence.*;

@Entity
public class TransformedEvent {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;

    @OneToOne
    @EmbeddedId
    private Event event;

    @Embedded
    private JsonObject json;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public JsonObject getJson() {
        return json;
    }

    public void setJson(JsonObject json) {
        this.json = json;
    }
}
