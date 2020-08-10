package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int rsl = (left > right) ? left : right;
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(max(5,2));
        System.out.println(max(2,5));
    }
}
