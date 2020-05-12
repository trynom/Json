package com.company;

public class JsonNumber extends JsonValue {
    private Number k;

    public JsonNumber(Number k){
        this.k= k;
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
        return "JsonNumber{" +
                "k=" + k +
                '}';
    }
}
