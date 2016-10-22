package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int max;

        if(maxBetweenTwoNumbers(a, b) > maxBetweenTwoNumbers(c, d)){
            max = maxBetweenTwoNumbers(a, b);
        } else if(maxBetweenTwoNumbers(c, d) > maxBetweenTwoNumbers(a, b)){
            max = maxBetweenTwoNumbers(c, d);
        } else {
            max = maxBetweenTwoNumbers(a, b);
        }

        System.out.println(max);
    }

    private static int maxBetweenTwoNumbers(int a, int b) {
        int max;

        if(a > b) {
            max = a;
        } else if (b > a) {
            max = b;
        } else {
            max = a;
        }

        return max;
    }
}
