package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> toThree = new ArrayList<Integer>();
        ArrayList<Integer> toTwo = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
        {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        for (Integer number :
                numbers)
        {
            if( number % 3 == 0) {
                if ( number % 2 == 0){
                    toThree.add(number);
                    toTwo.add(number);
                    continue;
                }
                toThree.add(number);
            } else if ( number % 2 == 0) {
                toTwo.add(number);
            } else {
                other.add(number);
            }
        }

        printList(toThree);
        printList(toTwo);
        printList(other);

    }

    public static void printList(List<Integer> list)
    {
        //напишите тут ваш код
        for (Integer num :
                list)
        {
            System.out.println(num);
        }
    }
}
