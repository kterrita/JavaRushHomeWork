package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a > b && b > c)
        {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if (a > b && b < c && c < a)
        {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        } else if (b > a && a > c)
        {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if (b > a && a < c && c < b)
        {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);;
        } else if (c > b && b > a)
        {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);;
        } else if (c > b && b < a && a < c)
        {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else if(a == b && c > a){
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else if(b == c && a > b){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if(a == c && b > a){
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if(a == b && c < a){
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if(b == c && a < b){
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if(a == c && b < a){
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else if(a == b && b == c){
            System.out.println(a);
            System.out.println(a);
            System.out.println(a);
        }
    }
}
