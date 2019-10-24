package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String week = reader.readLine();
        int week2 = Integer.parseInt(week);

        if (week2 == 1)
            System.out.println("понедельник");
        if (week2 == 2)
            System.out.println("вторник");
        if (week2 == 3)
            System.out.println("среда");
        if (week2 == 4)
            System.out.println("четверг");
        if (week2 == 5)
            System.out.println("пятница");
        if (week2 == 6)
            System.out.println("суббота");
        if (week2 == 7)
            System.out.println("воскресенье");
        if (week2 > 7 || week2 < 1)
            System.out.println("такого дня недели не существует");

    }
}