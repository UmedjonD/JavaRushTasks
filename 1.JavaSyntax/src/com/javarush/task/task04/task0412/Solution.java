package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String one = reader.readLine();
//        String two = reader.readLine();
//        String three = reader.readLine();

        int yak = Integer.parseInt(one);
//        int du = Integer.parseInt(two);
//        int se = Integer.parseInt(three);

        if (yak > 0)
            System.out.println(yak * 2);
        if (yak < 0)
            System.out.println(yak + 1);
        if (yak == 0)
            System.out.println(yak);

    }
}