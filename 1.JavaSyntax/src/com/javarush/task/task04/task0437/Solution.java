package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int k = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j<k;j++) {
                System.out.print(8);

            }
            k++;
            System.out.println();
        }

    }
}
