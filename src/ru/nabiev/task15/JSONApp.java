package ru.nabiev.task15;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class JSONApp {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        URL url = null;
        try {
            url = new URL("https://datazen.katren.ru/calendar/day/2020-01-01/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try (InputStream is = url.openStream();
             Reader reader = new InputStreamReader(is);
             BufferedReader br = new BufferedReader(reader);){
             System.out.println(br.readLine());
             Day day = objectMapper.readValue(url, Day.class);
             System.out.println(day);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
