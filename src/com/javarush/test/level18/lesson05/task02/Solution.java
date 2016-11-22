package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        int count = 0;
        FileInputStream fis = new FileInputStream(fileName);

        ArrayList<Integer> list = new ArrayList<>();

        while(fis.available() > 0) {
            list.add(fis.read());
        }

        for(Integer num : list) {
            if(num == 44) {
                count++;
            }
        }
        System.out.println(count);
        reader.close();
        fis.close();
    }
}
