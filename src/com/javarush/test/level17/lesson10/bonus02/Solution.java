package com.javarush.test.level17.lesson10.bonus02;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        //start here - начни тут
        if(args.length == 0)
            return;

        String param = args[0];
        int quantity;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        switch (param) {
            case "-c": {
                quantity = (args.length - 1)/3;
                for (int i = 0; i < quantity; i++)
                {
                    if(args[2 + 3 * i].equals("м")){
                        allPeople.add(Person.createMale(args[1 + 3 * i], sdf.parse(args[3 + 3 * i])));
                    } else if(args[2 + 3 * i].equals("ж")){
                        allPeople.add(Person.createFemale(args[1 + 3 * i], sdf.parse(args[3 + 3 * i])));
                    }
                    System.out.println(allPeople.size() - 1);
                }
                break;
            }
            case "-u": {
                quantity = (args.length - 1)/4;
                for (int i = 0; i < quantity; i++)
                {
                    for (int j = 0; j < allPeople.size(); j++)
                    {
                        if(j == Integer.valueOf(args[1 + 4 * i])){
                            allPeople.get(j).setName(args[2 + 4 * i]);
                            allPeople.get(j).setBirthDay(sdf.parse(args[4 + 4 * i]));
                            if(args[3 + 4 * i].equals("м")){
                                allPeople.get(j).setSex(Sex.MALE);
                            } else if(args[3 + 4 * i].equals("ж")){
                                allPeople.get(j).setSex(Sex.FEMALE);
                            }
                        }
                    }
                }
                break;
            }
            case "-d": {
                quantity = args.length - 1;
                for (int i = 0; i < quantity; i++)
                {
                    for (int j = 0; j < allPeople.size(); j++)
                    {
                        if (j == Integer.valueOf(args[1 + i]))
                        {
                            allPeople.get(j).setName(null);
                            allPeople.get(j).setSex(null);
                            allPeople.get(j).setBirthDay(null);
                        }
                    }
                }
                break;
            }
            case "-i": {
                quantity = args.length - 1;
                for (int i = 0; i < quantity; i++)
                {
                    for (int j = 0; j < allPeople.size(); j++)
                    {
                        if(j == Integer.valueOf(args[1 + i])){
                            outInfo(allPeople.get(j), j);
                        }
                    }
                }
                break;
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
