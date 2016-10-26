package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{


    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> pair : map.entrySet()) {
            System.out.println(pair);
        }
    }


    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallon", new Date("JULY 1 1980"));
        map.put("Stallo", new Date("AUGUST 1 1980"));
        map.put("Stall", new Date("MARCH 1 1980"));
        map.put("Stal", new Date("APRIL 1 1980"));
        map.put("Sta", new Date("JULY 1 1980"));
        map.put("St", new Date("JULY 1 1980"));
        map.put("S", new Date("APRIL 1 1980"));
        map.put("Ss", new Date("APRIL 1 1980"));
        map.put("Sss", new Date("APRIL 1 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        for (Iterator<Map.Entry<String, Date>> pair = map.entrySet().iterator(); pair.hasNext();)
        {
            Map.Entry<String, Date> p = pair.next();
            if (p.getValue().getMonth() == 5 || p.getValue().getMonth() == 6 || p.getValue().getMonth() == 7) {
                pair.remove();
            }
        }
    }
}
