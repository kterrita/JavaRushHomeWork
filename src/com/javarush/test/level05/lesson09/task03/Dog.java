package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    String name;
    int height;
    String colour;

    public Dog(String name, int height, String colour)
    {
        this.name = name;
        this.height = height;
        this.colour = colour;
    }

    public Dog(String name, int height)
    {

        this.name = name;
        this.height = height;
    }

    public Dog(String name)
    {

        this.name = name;
    }
}
