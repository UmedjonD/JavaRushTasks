package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int indexmin = 0;
        int indexmax = 0;
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int min = list.get(0).length();
        int max = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min) {
                indexmin = i;
                min = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max) {
                indexmax = i;
                max = list.get(i).length();
            }
        }
        if (indexmin < indexmax)
            System.out.println(list.get(indexmin));
        else
            System.out.println(list.get(indexmax));
//        int finish = (indexmax < indexmin) ? indexmax : indexmin;
//        System.out.println(list.get(finish));
    }
}
