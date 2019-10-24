package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String year = reader.readLine();
        String year2 = reader.readLine();
        int i = Integer.parseInt(year);
        int i2 = Integer.parseInt(year2);

        System.out.println(name + " получает " + i + " через " + i2 + " лет.");

    }
}
