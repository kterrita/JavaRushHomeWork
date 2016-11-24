package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream(args[0]);
        char[] array = new char[52];
        for (int i = 0; i < 26; i++)
        {
            array[i] = (char)(65 + i);
        }

        for (int i = 0; i < 26; i++) {
            array[26 + i] = (char)(97 + i);
        }

        int count = 0;

        while(fis.available() > 0) {
            char symbol = (char)fis.read();
            for (char sym : array)
            {
                if(sym == symbol){
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
        fis.close();
    }
}
