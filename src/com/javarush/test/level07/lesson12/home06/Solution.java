package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human fGM = new Human("Баба1", false, 64, null, null);
        Human fGF = new Human("Дед1", true, 65, null, null);
        Human mGM = new Human("Баба2", false, 71, null, null);
        Human mGF = new Human("Дед2", true, 70, null, null);
        Human mother = new Human("мама", false, 35, mGF, mGM);
        Human father = new Human("папа", true, 34, fGF, fGM);
        Human son1 = new Human("сын1", true, 10, father, mother);
        Human son2 = new Human("сын2", true, 11, father, mother);
        Human son3 = new Human("сын3", true, 12, father, mother);

        System.out.println(fGF);
        System.out.println(fGM);
        System.out.println(mGF);
        System.out.println(mGM);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);

    }

    public static class Human
    {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public Human father;
        public Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
