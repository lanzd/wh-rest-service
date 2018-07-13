package com.webhook.application.connector;

import com.webhook.application.endpoint.EndPoint;

import javax.persistence.*;

@Entity
@Embeddable
public class Connector {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;

    @Embedded
    private EndPoint endPoint;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ConnectorImpl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
