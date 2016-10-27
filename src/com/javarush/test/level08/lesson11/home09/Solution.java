package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 22 2000"));
    }

    public static boolean isDateOdd(String date)
    {
        Date start = new Date(date);
        start.setMonth(0);
        start.setDate(1);

        Date now = new Date(date);
        long time = now.getTime() - start.getTime();
        int days = (int) time / (60 * 60 * 24 * 1000);
        if(days % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
