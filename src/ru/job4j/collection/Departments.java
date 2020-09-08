package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        List<String> rsl = new ArrayList<>();
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start += el;
                tmp.add(start);
                start += "/";
                // tmp.add start + "/" + el
            }
        }
        return  new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("K2/SK2", "K2/SK1/SSK2", "K2/SK1/SSK1", "K2", "K2/SK1/SSK2", "K1", "K1/SK2", "K1/SK1",
                "K1/SK1/SSK1", "K1/SK1/SSK2");
        sortDesc(input);
        System.out.println(input);
        System.out.println("alex".compareTo("alex"));
    }
}
