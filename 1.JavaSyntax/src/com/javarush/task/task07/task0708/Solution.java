package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }
        int len = strings.get(0).length();

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > len)
                len = strings.get(i).length();
        }
        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == len)
                System.out.println(strings.get(i));
        }
    }
}
