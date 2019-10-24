package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        int i = Integer.parseInt(s);

        if ((i > 0) && (i<10) && (i % 2 == 0)){
            System.out.println("четное однозначное число");
        }else if ((i > 0) && (i<10) && (i % 2 != 0)) {
            System.out.println("нечетное однозначное число");
        }else if ((i >= 10) && (i<100) && (i % 2 == 0)) {
            System.out.println("четное двузначное число");
        }else if ((i >= 10) && (i<100) && (i % 2 != 0)) {
            System.out.println("нечетное двузначное число");
        }else if ((i >= 100) && (i<1000) && (i % 2 == 0)) {
            System.out.println("четное трехзначное число");
        }else if ((i >= 100) && (i<1000) && (i % 2 != 0)) {
            System.out.println("нечетное трехзначное число");
        }else {

        }
    }
}
