package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("guyazo@guyazo.com", "Ivanov");
        for (String s : map.keySet()) {
            String value = map.get(s);
            System.out.println("key: " + s + " value: " + value);
        }
    }
}
