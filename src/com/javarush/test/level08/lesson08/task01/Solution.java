package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<>();

        set.add("любовь");
        set.add("ласка");
        set.add("легкость");
        set.add("лакрица");
        set.add("лучик");
        set.add("лопата");
        set.add("лиана");
        set.add("лилия");
        set.add("лом");
        set.add("лось");
        set.add("лень");
        set.add("люк");
        set.add("лаз");
        set.add("лифт");
        set.add("лодка");
        set.add("лимон");
        set.add("ласты");
        set.add("лейка");
        set.add("лофт");
        set.add("ликер");

        return set;
    }
}
