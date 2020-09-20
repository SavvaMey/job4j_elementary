package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

//    public ArrayList<Person> find(String key) {
//        ArrayList<Person> result = new ArrayList<>();
//        for (Person person : persons) {
//            if (person.getAddress().contains(key) || person.getName().contains(key) || person.getSurname().contains(key)
//                    || person.getPhone().contains(key)) {
//                result.add(person);
//            }
//        }
//        return result;
//    }
public ArrayList<Person> find(String key) {
    Predicate<Person> checkName = (person) -> person.getName().equals(key);
    Predicate<Person> checkSurname = (person) -> person.getSurname().equals(key);
    Predicate<Person> checkPhone = (person) -> person.getPhone().equals(key);
    Predicate<Person> checkAdr = (person) -> person.getAddress().equals(key);
    Predicate<Person> combine = checkName.or(checkSurname.or(checkPhone).or(checkAdr));
    ArrayList<Person> result = new ArrayList<>();
    for (var person : persons) {
        if (combine.test(person)) {
            result.add(person);
        }
    }
    return result;
}
}
