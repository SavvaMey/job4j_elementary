package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] subStr1 = o1.split("\\.");
        String[] subStr2 = o2.split("\\.");
        return Integer.compare(Integer.parseInt(subStr1[0]), Integer.parseInt(subStr2[0]));
    }
}
