package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        int index = 0;
        for (int item : data) {
            if (data[index] == el) {
                rst = index;
                break;
            }
            index++;
        }
        return rst;
    }
}