package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");

    }

    public static void log(String s) {
        //напишите тут ваш код
        String stackTraceElement = Thread.currentThread().getStackTrace()[2].getMethodName();
        String stackTraceElement2 = Thread.currentThread().getStackTrace()[2].getClassName();

        System.out.println(stackTraceElement2 +": "+ stackTraceElement +": "+ s);

    }
}
