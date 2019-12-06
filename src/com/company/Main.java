package com.company;

import java.util.function.Predicate;

public class Main
{

//    to nie zadziała, bo później nie będzie jak odwołać się od pola "canDrink2", bo nie ma go w person
//    public Predicate<Person> canDrink2 = person -> person.getAge()>18 && !person.isDriving() && !person.isPregnant();

    public static void main(String[] args)
    {
        Person ola = new Person(23, false, false);
        Person dawid = new Person(13, false, false);
        serveDrink(ola);
        serveDrink(dawid);
    }

    static void serveDrink(Person person)
    {
        System.out.println(person.canDrink.test(person));
//        System.out.println("Używając booleana zamiast Predicate: " + person.canDrinkB);
    }


}
