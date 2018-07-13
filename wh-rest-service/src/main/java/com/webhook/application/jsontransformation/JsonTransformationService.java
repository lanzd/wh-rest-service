package com.webhook.application.jsontransformation;

import com.google.gson.JsonObject;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Service
public class JsonTransformationService {

    JsonObject transform(JsonObject json, JsonTransformation jsonTransformation){
        if(jsonTransformation == null){
            return json;
        }
        return applyTransformation(jsonTransformation,json);
    }

    private JsonObject applyTransformation(JsonTransformation jsonTransformation, JsonObject json) {
        throw new NotImplementedException();
    }

}
