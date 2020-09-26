package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        left = left.toLowerCase();
        right = right.toLowerCase();
        if (left.length() != right.length()) {
            return false;
        }
        HashMap<Character, Integer> leftMap = new HashMap<>();
        HashMap<Character, Integer> rightMap = new HashMap<>();
        for (Character s : left.toCharArray()) {
            if (leftMap.putIfAbsent(s, 1) != null) {
                leftMap.put(s, leftMap.get(s) + 1);
            }
        }
        for (Character s : right.toCharArray()) {
            if (rightMap.putIfAbsent(s, 1) != null) {
                rightMap.put(s, rightMap.get(s) + 1);
            }
        }
        for (Map.Entry<Character, Integer> item : leftMap.entrySet()) {
            Character character = item.getKey();
            if (!rightMap.containsKey(character)) {
                return false;
            }
            Integer count = item.getValue();
            if (!rightMap.get(character).equals(count)) {
                return false;
            }
        }
        return true;
    }
}
