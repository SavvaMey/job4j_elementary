package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 3;
            case "Пятница", "Friday" -> 3;
            case "Суббота", "Saturday" -> 3;
            case "Воскресение", "Sunday" -> 3;
            default -> -1;
        };
    }
}
