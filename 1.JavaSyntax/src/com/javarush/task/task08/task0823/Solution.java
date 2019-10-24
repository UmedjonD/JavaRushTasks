package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //напишите тут ваш код
        String[] word = s.split(" +");
        for (String s1 : word) {
            if (s1.length() != 0)
            System.out.println(s1.substring(0, 1).toUpperCase() + s1.substring(1));
        }
        //
        //
    }
}
