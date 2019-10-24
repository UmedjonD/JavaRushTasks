package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

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

        int max = Math.max(Math.max(a1, a2), a3);
        int min = Math.min(Math.min(a1, a2),a3);
        int sered = a1 + a2 + a3 - (max + min);

        System.out.println(max + " " + sered + " " + min);

        //работает но такой метод не проходить
        //        Integer[] arr = new Integer[3];
//
//        for (int i = 0; i < 3; i++) {
//            String s1 = reader.readLine();
//            int a1 = Integer.parseInt(s1);
//            arr[i] = a1;
//        }
//        Arrays.sort(arr, Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr));

    }
}
