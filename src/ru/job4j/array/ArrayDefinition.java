package ru.job4j.array;

public class ArrayDefinition {
    // old
    short[] ages = new short[10];
    String[] surnames = new String[100500];
    float[] prices = new float[40];

    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Savva";
        names[1] = "Petr";
        names[2] = "Niko";
        names[3] = "Alex";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }

}
