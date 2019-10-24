package com.javarush.task.task08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Время для 10 тысяч вставок
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long getTimeMsOfInsert(List list) {
        //напишите тут ваш код
        Date currentTime = new Date(); //получаем текущую дату и время
        long millisec = currentTime.getTime();

        insert10000(list);

        Date newTime = new Date(); // получаем новое текущее время
        long mill2 = newTime.getTime();
        long msDelay = mill2 - millisec; //вычисляем разницу

        return  msDelay;
        //напишите тут ваш код
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
