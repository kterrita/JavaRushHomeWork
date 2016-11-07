package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        while (fileReader.ready())
        {
            numbers.add(Integer.parseInt(fileReader.readLine()));
        }

        for (Integer num :
                numbers)
        {
            if (num % 2 == 0)
            {
                result.add(num);
            }
        }

        Collections.sort(result);
        for (Integer num :
                result)
        {
            System.out.println(num);
        }
    }
}
