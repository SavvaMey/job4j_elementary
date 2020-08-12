package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j]; /* переменная для временного хранения значение ячейки с индексом 0. */
                    array[j] = array[i]; /* записываем в ячейку с индексом 0 значение ячейки с индексом 3. */
                    array[i] = temp; /* записываем в ячейку с индексом 3 значение временной переменной. */
                }
            }
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
