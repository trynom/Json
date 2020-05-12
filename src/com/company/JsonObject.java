package com.company;

import java.util.Map;

public class JsonObject extends JsonValue {
    private Map<String, JsonValue> o;

    public JsonObject(){

    }

    @Override
    public JsonValue get(int i) {
        return null;
    }

    @Override
    public JsonValue get(String s) {
        return null;
    }

    @Override
    public String toString() {
        return "JsonObject{" +
                "o=" + o +
                '}';
    }
}
