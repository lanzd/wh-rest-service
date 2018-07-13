package com.webhook.application.event;

import com.google.gson.JsonObject;
import com.webhook.application.connector.Connector;

import javax.persistence.*;

@Entity
@Embeddable
public class Event {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;

    @ManyToOne
    private Connector connector;

    @Embedded
    private JsonObject json;

    public Connector getConnector() {
        return connector;
    }

    public void setConnector(Connector connector) {
        this.connector = connector;
    }

    public JsonObject getJson() {
        return json;
    }

    public void setJson(JsonObject json) {
        this.json = json;
    }
}
