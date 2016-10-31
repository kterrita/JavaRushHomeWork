package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[5]);
        list.add(new int[2]);
        list.add(new int[4]);
        list.add(new int[7]);
        int[] arr = {};
        list.add(arr);

        for (int i = 0; i < list.get(0).length; i++)
        {
            list.get(0)[i] = 1;
        }
        for (int i = 0; i < list.get(1).length; i++)
        {
            list.get(1)[i] = 2;
        }
        for (int i = 0; i < list.get(2).length; i++)
        {
            list.get(2)[i] = 3;
        }
        for (int i = 0; i < list.get(3).length; i++)
        {
            list.get(3)[i] = 4;
        }
        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
