package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.Date;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name;
        String lastName;
        Date date;
        int phoneNumber;
        int age;
        boolean sex;

        public Human(String name, String lastName, Date date, int phoneNumber, boolean sex)
        {
            this.name = name;
            this.lastName = lastName;
            this.date = date;
            this.phoneNumber = phoneNumber;
            this.sex = sex;
        }

        public Human(String name, String lastName, Date date, boolean sex)
        {

            this.name = name;
            this.lastName = lastName;
            this.date = date;
            this.sex = sex;
        }

        public Human(String name, String lastName, int phoneNumber, int age, boolean sex)
        {

            this.name = name;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String lastName, int age, boolean sex)
        {

            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String lastName, boolean sex)
        {

            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
        }

        public Human(String name, String lastName, Date date, int phoneNumber, int age, boolean sex)
        {

            this.name = name;
            this.lastName = lastName;
            this.date = date;
            this.phoneNumber = phoneNumber;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String lastName, Date date, int phoneNumber, int age)
        {

            this.name = name;
            this.lastName = lastName;
            this.date = date;
            this.phoneNumber = phoneNumber;
            this.age = age;
        }

        public Human(String name, String lastName, Date date, int phoneNumber)
        {

            this.name = name;
            this.lastName = lastName;
            this.date = date;
            this.phoneNumber = phoneNumber;
        }

        public Human(String name, String lastName, Date date)
        {

            this.name = name;
            this.lastName = lastName;
            this.date = date;
        }

        public Human(String name, String lastName)
        {

            this.name = name;
            this.lastName = lastName;
        }
    }
}
