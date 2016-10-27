package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        String result = "";
        String modify = s.trim().replaceAll(" +", " ");
        String[] array = modify.split(" ");
        String[] copyArray = modify.split(" ");

        for (int i = 0; i < array.length; i++)
        {
            String temp = copyArray[i].substring(0, 1).toUpperCase();
            copyArray[i] = temp + copyArray[i].substring(1);
            if(s.contains(array[i])){
                result = s.replace(array[i], copyArray[i]);
                s = result;
            }
        }

        System.out.println(result);
    }


}
