package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String URL = reader.readLine();

        parser(URL);
    }

    private static void parser(String URL){
        String s = URL.replaceAll("(^.*?\\?)","");

        String[] valueArray = s.split("&");
        String[] paraArray = new String[valueArray.length];

        System.arraycopy(valueArray, 0, paraArray, 0, valueArray.length);

        for (int i = 0; i < paraArray.length; i++)
        {
            paraArray[i] = paraArray[i].replaceAll("=(.*?$)","");
            System.out.print(paraArray[i] + " ");
            if(i == paraArray.length - 1) {
                System.out.println();
            }
        }


        for (int i = 0; i < valueArray.length; i++)
        {
            if(valueArray[i].contains("="))
            {
                valueArray[i] = valueArray[i].replaceAll("(^.*?)=", "");
            } else {
                valueArray[i] = "";
            }
        }

        Pattern doublePattern = Pattern.compile("[0-9.]");

        for (int i = 0; i < paraArray.length; i++)
        {
            Matcher matcher = doublePattern.matcher(valueArray[i]);
            if(paraArray[i].equals("obj")){
                if(matcher.find()){
                    alert(Double.parseDouble(valueArray[i]));
                } else {
                    alert(valueArray[i]);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
