package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> future = new ArrayList<>();
        Human c1 = new Human("c1", true, 12, future);
        Human c2 = new Human("c2", true, 11, future);
        Human c3 = new Human("c3", true, 10, future);

        ArrayList<Human> children2 = new ArrayList<>();
        children2.add(c1);
        children2.add(c2);
        children2.add(c3);

        Human f = new Human("f", true, 45, children2);
        Human m = new Human("m", false, 44, children2);

        ArrayList<Human> children0 = new ArrayList<>();
        children0.add(f);
        ArrayList<Human> children1 = new ArrayList<>();
        children1.add(m);


        Human gF = new Human("gF", true, 89, children0);
        Human gF2 = new Human("gF2", true, 88, children1);
        Human gM = new Human("gM", false, 85, children0);
        Human gM2 = new Human("gM2", false, 84, children1);

        System.out.println(gF);
        System.out.println(gF2);
        System.out.println(gM);
        System.out.println(gM2);
        System.out.println(f);
        System.out.println(m);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
