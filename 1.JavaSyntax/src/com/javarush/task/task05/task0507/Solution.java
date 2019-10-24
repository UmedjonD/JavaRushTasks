package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double couint = 0;
        double number;
        double sum = 0;

        while (true) {
            number = Integer.parseInt(reader.readLine());
            if (number == -1) {
                break;
            }
            sum += number;
            couint++;
        }
        System.out.println(sum / couint);
    }
}

