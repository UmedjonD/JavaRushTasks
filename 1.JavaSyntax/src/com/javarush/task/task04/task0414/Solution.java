package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        int yeard = Integer.parseInt(str);
        int x = 365;
        int y = 366;

        if (yeard % 400 == 0)
            System.out.println("количество дней в году: "+ y);
        if (yeard % 100 == 0 && yeard % 400 != 0)
            System.out.println("количество дней в году: "+ x);
        if (yeard % 4 == 0 && yeard % 100 != 0)
            System.out.println("количество дней в году: "+ y);
        if (yeard % 4 != 0 && yeard % 100 != 0)
            System.out.println("количество дней в году: "+ x);

    }
}