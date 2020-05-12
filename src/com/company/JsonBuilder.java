package com.company;

//import package.CharScanner ;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class JsonBuilder extends JsonValue {
    private CharScanner sc;
    private JsonValue v;


    public JsonBuilder(File f) throws FileNotFoundException {
        sc = new CharScanner(new File("JasonInput.txt"));
        this.v = parseValue();
    }

    public JsonValue parseValue() {
        char c; //used for isdigit function to recognize a number
        c = sc.next();
        while (sc.hasNext()) {
            if (c == '"') {
                return parseString();   //["asd", 1]
            }
            if (c == '[') {
                return parseArray();
            }
            if(Character.isDigit(c)){
                return parseNumber();
            }

        }
        return null;   //TODO EXCEPTION???
    }
    public JsonArray parseArray(){
        JsonArray list = new JsonArray(); //TODO check other implementations of List
        char c;
        while( (c = sc.next())!= ']'){
            if ( c != ','){
                list.add(parseValue());
            }
        }
        return list;
    }

    public JsonObject parseObject(){

    return null;}

    public JsonString parseString () {
        String str = "";
        char c;
        while ((c = sc.next()) != '"') {
            str += c;
        }
        return new JsonString(str);

    }

    public JsonNumber parseNumber () {



        return null;
    }


    @Override
    public JsonValue get ( int i){
        return null;
    }

    @Override
    public JsonValue get (String s){

        return null;
    }

    @Override
    public String toString () {
        return "JsonBuilder{" +
                "v=" + v +
                '}';
    }
}