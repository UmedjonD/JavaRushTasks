package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String t = reader.readLine();
        double t1 = Double.parseDouble(t);
        double ostatok = t1 % 5;

        if (ostatok < 3)
            System.out.println("зеленый");
        if (ostatok >= 3 && ostatok < 4)
            System.out.println("желтый");
        if (ostatok >= 4 && ostatok < 5)
            System.out.println("красный");

    }
}