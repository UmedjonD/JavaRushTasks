package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.Random;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        if(i1 > i2)
            System.out.println(i2);
        else if (i2 > i1){
            System.out.println(i1);
        }else {
            System.out.println(i1);
        }
    }
}