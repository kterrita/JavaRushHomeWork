package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream fis2 = new FileInputStream(fileName2);
        FileInputStream fis3 = new FileInputStream(fileName3);
        FileOutputStream fos = new FileOutputStream(fileName1);

        while(fis2.available() > 0) {
            int data = fis2.read();
            fos.write(data);
        }

        while(fis3.available() > 0) {
            int data = fis3.read();
            fos.write(data);
        }

        reader.close();
        fis2.close();
        fis3.close();
        fos.close();
    }
}
