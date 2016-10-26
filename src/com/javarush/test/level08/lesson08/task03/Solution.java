package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{

 /*   public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();

        System.out.println(getCountTheSameFirstName(map, "Сидр"));
        System.out.println(getCountTheSameLastName(map, "Иванов"));
    }
*/

    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();

        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Сидр");
        map.put("Кропоткин", "Кроп");
        map.put("Туполев", "Туп");
        map.put("Смазкин", "Смаз");
        map.put("Поветухин", "Повет");
        map.put("Трубаев", "Труб");
        map.put("Следопытов", "Сидр");
        map.put("Парков", "Петр");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int result = 0;

        for(Map.Entry<String, String> pair : map.entrySet()) {
            if(name.equals(pair.getValue())){
                result++;
            }
        }

        return result;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int result = 0;

        for(Map.Entry<String, String> pair : map.entrySet()) {
            if(lastName.equals(pair.getKey())){
                result++;
            }
        }

        return result;
    }
}
