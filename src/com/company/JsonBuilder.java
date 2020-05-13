package com.company;




import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class JsonBuilder extends JsonValue {
    private CharScanner sc;
    private JsonValue v;


    public JsonBuilder(File f) throws FileNotFoundException {
        sc = new CharScanner(f);
        this.v = parseValue();
    }

    public JsonValue parseValue() {
        char c; //used for isdigit function to recognize a number
        while (sc.hasNext()) {
            c = sc.peek();
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
        c = sc.next();
        while( (c = sc.peek())!= ']'){
            list.add(parseValue());
            if ( (c = sc.peek()) == ',') {
                c = sc.next();
            }
        }
        return list;
    }

    public JsonObject parseObject(){

    return null;}

    public JsonString parseString () {
        String str = "";
        char c= sc.next();
        while ((c = sc.next()) != '"') {
            str += c;
        }
        return new JsonString(str);
    }

    public JsonNumber parseNumber () {
        String s= "";
        //s+= sc.next();
        char c;
        while(sc.hasNext() && (Character.isDigit(c=sc.next()))){
            s += c;
        }
        return new JsonNumber(s);
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
        return ""+v;
    }
}