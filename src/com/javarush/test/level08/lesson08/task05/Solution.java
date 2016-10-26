package com.javarush.test.level08.lesson08.task05;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);

        for (Map.Entry<String, String> pair :
                map.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }



    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();

        map.put("Иванов", "Иванушка");
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код

        HashMap<String, String> copy = new HashMap<>(map);
        for (Iterator<Map.Entry<String, String>> pair = copy.entrySet().iterator(); pair.hasNext();)
        {
            int i = 0;
            Map.Entry<String, String> p = pair.next();
            for (Iterator<Map.Entry<String, String>> pairInside = copy.entrySet().iterator(); pairInside.hasNext();)
            {
                Map.Entry<String, String> pI = pairInside.next();
                if(p.getValue().equals(pI.getValue())) {
                    i++;
                }
            }
            if(i > 1) {
                removeItemFromMapByValue(map, p.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
