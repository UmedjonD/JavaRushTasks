package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a1 = Integer.parseInt(reader.readLine());
        int a2 = Integer.parseInt(reader.readLine());
        int a3 = Integer.parseInt(reader.readLine());

        if (a1 == a2 && a1==a3 && a2==a3){
            System.out.println(a1);
        }else {
            int max = Math.max(Math.max(a1, a2),a3);
            int min = Math.min(Math.min(a1, a2),a3);
            int sred = a1 + a2 + a3 - (max + min);
            System.out.println(sred);
        }

    }
}
