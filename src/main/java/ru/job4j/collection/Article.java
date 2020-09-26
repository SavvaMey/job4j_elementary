package ru.job4j.collection;

import java.util.*;

public class Article {
    public static boolean generateBy(String origin, String line) {
        String originString = origin.toLowerCase();
        String[] lineString = line.split("[., :;!///]+");
        Set<String> set = new HashSet<>(Arrays.asList(lineString));
        for (String s : set) {
            if (!originString.contains(s.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
}
