package com.javarush.test.level17.lesson10.bonus01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception{
        //start here - начни тут
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        if(args[0].equals("-c")){
            if(args[2].equals("м")){
                allPeople.add(Person.createMale(args[1], sdf.parse(args[3])));
            } else if(args[2].equals("ж")){
                allPeople.add(Person.createFemale(args[1], sdf.parse(args[3])));
            }
            System.out.println(allPeople.size() - 1);

        } else if(args[0].equals("-u")){
            for (int i = 0; i < allPeople.size(); i++)
            {
                if(i == Integer.valueOf(args[1])){
                    allPeople.get(i).setName(args[2]);
                    allPeople.get(i).setBirthDay(sdf.parse(args[4]));
                    if(args[3].equals("м")){
                        allPeople.get(i).setSex(Sex.MALE);
                    } else if(args[3].equals("ж")){
                        allPeople.get(i).setSex(Sex.FEMALE);
                    }
                }
            }
        } else if(args[0].equals("-d")){
            for (int i = 0; i < allPeople.size(); i++)
            {
                if(i == Integer.valueOf(args[1])){
                    allPeople.get(i).setName(null);
                    allPeople.get(i).setSex(null);
                    allPeople.get(i).setBirthDay(null);
                }
            }
        } else if(args[0].equals("-i")){
            for (int i = 0; i < allPeople.size(); i++)
            {
                if(i == Integer.valueOf(args[1])){
                    outInfo(allPeople.get(i), i);
                }
            }
        }
    }

    private static void outInfo(Person person, int id) {
        StringBuilder sb = new StringBuilder();
        String result;
        String sex = "";

        if(person.getSex().equals(Sex.MALE)){
            sex = "м";
        } else if(person.getSex().equals(Sex.FEMALE)){
            sex = "ж";
        }

        sb.append(person.getName());
        sb.append(" ");
        sb.append(sex);
        sb.append(" ");
        sb.append(formatData(person.getBirthDay()));

        result = sb.toString();

        System.out.println(result);
    }

    private static String formatData(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String result;
        result = sdf.format(date);

        return result;
    }
}
