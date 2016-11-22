package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
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

        FileInputStream fis = new FileInputStream(fileName1);
        FileOutputStream fos1 = new FileOutputStream(fileName2);
        FileOutputStream fos2 = new FileOutputStream(fileName3);

        while(fis.available() > 0) {
            if(fis.available() % 2 == 0) {
                byte[] buffer1 = new byte[fis.available()/2];
                byte[] buffer2 = new byte[fis.available()/2];
                int count1 = fis.read(buffer1);
                int count2 = fis.read(buffer2);
                fos1.write(buffer1, 0, count1);
                fos2.write(buffer2, 0, count2);
            } else {
                byte[] buffer1 = new byte[fis.available()/2 + 1];
                byte[] buffer2 = new byte[fis.available()/2];
                int count1 = fis.read(buffer1);
                int count2 = fis.read(buffer2);
                fos1.write(buffer1, 0, count1);
                fos2.write(buffer2, 0, count2);
            }
        }

        reader.close();
        fis.close();
        fos1.close();
        fos2.close();
    }
}
