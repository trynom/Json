package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        CharScanner cs1;
        cs1 = new CharScanner(new File("C:\\Users\\tal5s\\IdeaProjects\\Json\\src"));
        BufferedReader br = new BufferedReader(new FileReader("temp.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

    }
}
