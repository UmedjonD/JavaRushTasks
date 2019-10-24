package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();

        int a1 = Integer.parseInt(s1);
        int a2 = Integer.parseInt(s2);

        if (a1>0 && a2>0){
            System.out.println("1");
        } else if (a1 < 0 && a2 > 0) {
            System.out.println("2");
        } else if (a1 < 0 && a2 < 0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
}
