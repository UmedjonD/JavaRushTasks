package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int n = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        if (n <= 0 || n2 <=0) {
            throw new Exception();
        }
        scanner.close();
        System.out.println(nod(n,n2));
    }

    public static int nod(int x1, int x2) {

        int min;
        int n = 1;

        if (x1 < x2) min = x1;
        else min = x2;

        for (int i = min; i > 0; i--) {
            if (x1 % i == 0 && x2 % i == 0) {
                n = i;
                break;
            }
        }

        return n;
    }
}
