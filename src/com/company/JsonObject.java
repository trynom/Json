package com.company;

import java.util.HashMap;
import java.util.Map;

public class JsonObject extends JsonValue {
    private Map<String, JsonValue> o;

    public JsonObject(){
        o= new HashMap<>();

    }

    public Object put(String s, JsonValue Jv){
        return o.put(s, Jv);
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
        return "JsonObject"+o;
    }
}
