package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {
            divisionByZero();
        }
        catch (Exception e){
            e.printStackTrace();
            //System.out.println("Ошибка, на ноль делит нельзя ");
        }

    }
    public static void divisionByZero(){
        int a = 5;
        int c = a / 0;
        System.out.println(c);
    }
}
