package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        boolean falg = true;
        while (falg) {
            int i = Integer.parseInt(reader.readLine());
            if (i == -1) {
                number += i;
                break;
            }
            number += i;
        }
        System.out.println(number);
    }
}
