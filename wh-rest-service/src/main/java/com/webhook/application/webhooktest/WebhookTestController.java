package com.webhook.application.webhooktest;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/{connector}")
public class WebhookTestController {


    WebHookTest test(@PathVariable("connector") long connectorId, HttpRequest request){
        return null;
    }

}
