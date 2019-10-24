package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int count = 0;
        int maximum = Integer.MIN_VALUE;

        while (count < N) {
            count++;
            int num = Integer.parseInt(reader.readLine());
            if (num > maximum) {
                maximum = num;
            }
        }
        System.out.println(maximum);
        //напишите тут ваш код

    }
}
