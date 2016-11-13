package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by илья on 12.11.2016.
 */
public class Plane implements Flyable
{
    private int passengers;

    public Plane(int passengers)
    {
        this.passengers = passengers;
    }

    @Override
    public void fly()
    {

    }
}
