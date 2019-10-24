package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();
        int w = Integer.parseInt(a);
        int nol = 0;

        if ((w > nol) && (w % 2 == 0)) {
            System.out.println("положительное четное число");
        }else if ((w > nol) && (w % 2 != 0)) {
            System.out.println("положительное нечетное число");
        }else if ((w < nol) && (w % 2 == 0)){
            System.out.println("отрицательное четное число");
        } else if ((w < nol) && (w % 2 != 0)) {
            System.out.println("отрицательное нечетное число");
        } else {
            System.out.println("ноль");
        }
    }
}
