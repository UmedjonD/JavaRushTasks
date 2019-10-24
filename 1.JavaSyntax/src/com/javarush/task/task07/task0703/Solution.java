package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] stringArr = new String[10];
        int[] intArr = new int[10];

        for (int i = 0; i < 10; i++) {
            stringArr[i] = reader.readLine();
            intArr[i] = stringArr[i].length();
//            System.out.println(intArr[i]);
        }
        for (int i=0; i<10; i++) {
            System.out.println(intArr[i]);
        }

    }
}
