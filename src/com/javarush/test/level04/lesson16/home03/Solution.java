package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        boolean isTrue = false;

        while (!isTrue) {
            int i = Integer.parseInt(reader.readLine());
            sum = sum + i;

            if(i == -1){
                isTrue = true;
            }
        }
        System.out.println(sum);
    }
}
