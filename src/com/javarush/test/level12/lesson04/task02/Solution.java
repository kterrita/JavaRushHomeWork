package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        new Solution().print(0);
        new Solution().print(new Integer(1));
    }

    //Напишите тут ваши методы
    void print(int i){}
    void print(Integer i){}
}
