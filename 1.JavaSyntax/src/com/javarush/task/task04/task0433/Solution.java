package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int n = 10;
        int n2 = 10;

        while (n > 0) {
            while (n2 > 1) {
                n2--;
                System.out.print("S");
            }
            n--;
            n2 = 10;
            System.out.println("S");
        }
    }
}
