package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fis = new FileInputStream(fileName);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        TreeMap<Integer, Integer> result = new TreeMap<>();

        while (fis.available() > 0)
        {
            list.add(fis.read());
        }

        for (int i = 0; i < list.size(); i++)
        {
            int innerRepeat = 0;
            for (int j = 0; j < list.size(); j++)
            {
                if (list.get(i).equals(list.get(j)))
                {
                    innerRepeat++;
                }
            }
            numbers.add(innerRepeat);
            result.put(innerRepeat, list.get(i));
        }
        Set<Integer> hs = new HashSet<>();
        hs.addAll(numbers);
        numbers.clear();
        numbers.addAll(hs);

        Collections.sort(numbers);

        for (Map.Entry<Integer, Integer> pair : result.entrySet())
        {
            if (pair.getKey().equals(numbers.get(0)))
            {
                System.out.println(pair.getValue() + " ");
            }
        }

        reader.close();
        fis.close();
    }
}
