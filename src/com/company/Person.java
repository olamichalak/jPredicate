package com.company;

import java.util.function.Predicate;

public class Person
{
    private int age;
    private boolean isPregnant;
    private boolean isDriving;

    public Person(int age, boolean isPregnant, boolean isDriving)
    {
        this.age = age;
        this.isPregnant = isPregnant;
        this.isDriving = isDriving;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public boolean isPregnant()
    {
        return isPregnant;
    }

    public void setPregnant(boolean pregnant)
    {
        isPregnant = pregnant;
    }

    public boolean isDriving()
    {
        return isDriving;
    }

    public void setDriving(boolean driving)
    {
        isDriving = driving;
    }

    public Predicate<Person> canDrink = person -> person.getAge()>18 && !person.isDriving() && !person.isPregnant();

//    to nie zadziała
//    public boolean canDrinkB = (getAge()>18 && !isDriving() && !isPregnant());
}
