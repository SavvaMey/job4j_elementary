package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] s1 = o1.split("/");
        String[] s2 = o2.split("/");
        int min = Math.min(s1.length, s2.length);
        int rsl;
        for (int i = 0; i < min; i++) {
            rsl = s2[i].compareTo(s1[i]);
            if (rsl != 0) {
                return rsl;
            }
        }
        return Integer.compare(o2.length(), o1.length());
    }
}
