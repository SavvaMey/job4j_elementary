package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexLeft = 0;
        int indexRight = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (indexLeft < left.length && indexRight < right.length) {
                rsl[i] = (left[indexLeft] > right[indexRight]) ? right[indexRight++] : left[indexLeft++];
            } else {
                rsl[i] = (indexLeft < left.length) ? left[indexLeft++] : right[indexRight++];
            }
        }
        return rsl;
    }
}
