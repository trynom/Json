package com.company;

import java.util.HashMap;
import java.util.Map;

public class JsonObject extends JsonValue {
    private Map<String, JsonValue> o;

    public JsonObject() {
        o = new HashMap<String, JsonValue>() {
        };

    }

    public Object put(String s, JsonValue Jv) {
        return o.put(s, Jv);
    }

    @Override
    public JsonNumber get(int i) {
        return null; // o.get((o.keySet().toArray())[i]); // return value by index
    }

    @Override
    public JsonValue get(String s) { // return value by key
        return o.get(s);
    }

    @Override
    public String toString() {
        String buf = new String();
        buf += "{";
        for (String key : o.keySet()) {
            buf += "<" + key + ":" + o.get(key) + ">";

        }
        buf += "}";
        return buf;
    }
}
