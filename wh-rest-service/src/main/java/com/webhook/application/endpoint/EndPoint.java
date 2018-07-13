package com.webhook.application.endpoint;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EndPoint {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private long id;

    private String url;

    private EndPointType httpMethod;

    public EndPointType getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(EndPointType httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
