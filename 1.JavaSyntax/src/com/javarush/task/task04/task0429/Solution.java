package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int coutP = 0;
        int countO = 0;

        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(reader.readLine());
            if (n>0) coutP++;
            if (n<0) countO--;
        }
        System.out.println("количество отрицательных чисел: " + countO);
        System.out.println("количество положительных чисел: " + coutP);

        //второй варинат решения
//        String s1 = reader.readLine();
//        String s2 = reader.readLine();
//        String s3 = reader.readLine();
//
//        int a1 = Integer.parseInt(s1);
//        int a2 = Integer.parseInt(s2);
//        int a3 = Integer.parseInt(s3);
//
//        if (a1 < 0 && a2 > 0 && a3 > 0) {
//            System.out.println("количество отрицательных чисел: 1");
//            System.out.println("количество положительных чисел: 2");
//        } else if (a2 < 0 && a1 > 0 && a3 > 0) {
//            System.out.println("количество отрицательных чисел: 1");
//            System.out.println("количество положительных чисел: 2");
//        } else if (a3 < 0 && a1 > 0 && a2 > 0) {
//            System.out.println("количество отрицательных чисел: 1");
//            System.out.println("количество положительных чисел: 2");
//        } else if (a1 < 0 && a2 < 0 && a3 > 0) {
//            System.out.println("количество отрицательных чисел: 2");
//            System.out.println("количество положительных чисел: 1");
//        } else if (a1 < 0 && a3 < 0 && a2 > 0) {
//            System.out.println("количество отрицательных чисел: 2");
//            System.out.println("количество положительных чисел: 1");
//        } else if (a2 < 0 && a3 < 0 && a1 > 0) {
//            System.out.println("количество отрицательных чисел: 2");
//            System.out.println("количество положительных чисел: 1");
//        } else if (a1 > 0 && a2 > 0 && a3 > 0) {
//            System.out.println("количество отрицательных чисел: 0");
//            System.out.println("количество положительных чисел: 3");
//        } else if (a1 < 0 && a2 < 0 && a3 < 0) {
//            System.out.println("количество отрицательных чисел: 3");
//            System.out.println("количество положительных чисел: 0");
//        } else if (a1 == 0 && a2 > 0 && a3 > 0) {
//            System.out.println("количество отрицательных чисел: 0");
//            System.out.println("количество положительных чисел: 2");
//        } else if (a2 == 0 && a1 > 0 && a3 > 0) {
//            System.out.println("количество отрицательных чисел: 0");
//            System.out.println("количество положительных чисел: 2");
//        } else if (a3 == 0 && a1 > 0 && a2 > 0) {
//            System.out.println("количество отрицательных чисел: 0");
//            System.out.println("количество положительных чисел: 2");
//        } else if (a1 == 0 && a2 == 0 && a3 > 0) {
//            System.out.println("количество отрицательных чисел: 0");
//            System.out.println("количество положительных чисел: 1");
//        } else if (a1 == 0 && a3 == 0 && a2 > 0) {
//            System.out.println("количество отрицательных чисел: 0");
//            System.out.println("количество положительных чисел: 1");
//        } else if (a2 == 0 && a3 == 0 && a1 > 0) {
//            System.out.println("количество отрицательных чисел: 0");
//            System.out.println("количество положительных чисел: 1");
//        } else if (a1 == 0 && a2 < 0 && a3 < 0) {
//            System.out.println("количество отрицательных чисел: 2");
//            System.out.println("количество положительных чисел: 0");
//        } else if (a2 == 0 && a1 < 0 && a3 < 0) {
//            System.out.println("количество отрицательных чисел: 2");
//            System.out.println("количество положительных чисел: 0");
//        } else if (a3 == 0 && a2 < 0 && a1 < 0) {
//            System.out.println("количество отрицательных чисел: 2");
//            System.out.println("количество положительных чисел: 0");
//        } else  if (a1 == 0 && a2>0 && a3<0){
//            System.out.println("количество отрицательных чисел: 1");
//            System.out.println("количество положительных чисел: 1");
//        } else  if (a1 == 0 && a3>0 && a2<0){
//            System.out.println("количество отрицательных чисел: 1");
//            System.out.println("количество положительных чисел: 1");
//        } else  if (a2 == 0 && a1>0 && a3<0){
//            System.out.println("количество отрицательных чисел: 1");
//            System.out.println("количество положительных чисел: 1");
//        } else  if (a2 == 0 && a3>0 && a1<0){
//            System.out.println("количество отрицательных чисел: 1");
//            System.out.println("количество положительных чисел: 1");
//        } else  if (a3 == 0 && a2>0 && a1<0){
//            System.out.println("количество отрицательных чисел: 1");
//            System.out.println("количество положительных чисел: 1");
//        } else  if (a3 == 0 && a1>0 && a2<0){
//            System.out.println("количество отрицательных чисел: 1");
//            System.out.println("количество положительных чисел: 1");
//        } else {
//
//        }

    }
}
