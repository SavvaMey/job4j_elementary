package ru.job4j.condition;
//CHANGES
public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return (ab < ac + bc && ac < ab + bc && bc < ab + ac);
    }
}
