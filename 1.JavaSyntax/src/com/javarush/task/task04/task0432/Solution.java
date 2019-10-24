package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        int a1 = Integer.parseInt(reader.readLine());

        while (a1 > 0) {
            a1--;
            System.out.println(s1);
        }

    }
}
