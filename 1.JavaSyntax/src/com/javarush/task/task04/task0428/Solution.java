package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();

        int a1 = Integer.parseInt(s1);
        int a2 = Integer.parseInt(s2);
        int a3 = Integer.parseInt(s3);

        if (a1 <= 0 && a2 > 0 && a3 > 0) {
            System.out.println("2");
        } else if (a2 <= 0 && a1 > 0 && a3 > 0) {
            System.out.println("2");
        } else if (a3 <= 0 && a1 > 0 && a2 > 0) {
            System.out.println("2");
        } else if (a1 <= 0 && a2 <= 0 && a3 > 0) {
            System.out.println("1");
        } else if (a1 <= 0 && a3 <= 0 && a2 > 0) {
            System.out.println("1");
        } else if (a2 <= 0 && a3 <= 0 && a1 > 0) {
            System.out.println("1");
        } else if (a1 > 0 && a2 > 0 && a3 > 0) {
            System.out.println("3");
        } else if (a1 <= 0 && a2 <= 0 && a3 <= 0) {
            System.out.println("0");
        } else {

        }
    }
}
