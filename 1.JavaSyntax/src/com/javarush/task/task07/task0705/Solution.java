package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArr = new int[20];
        int[] smallArr1 = new int[10];
        int[] smallArr2 = new int[10];

        for (int i = 0; i < bigArr.length; i++) {
            bigArr[i] = Integer.parseInt(reader.readLine());
        }
        System.arraycopy(bigArr, 0, smallArr1, 0, 10);
        System.arraycopy(bigArr, 10, smallArr2, 0, 10);

        for (int i = 0; i < smallArr2.length; i++) {
            System.out.println(smallArr2[i]);
        }

    }
}
