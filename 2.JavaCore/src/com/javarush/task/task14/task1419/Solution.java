package com.javarush.task.task14.task1419;

import java.beans.ExceptionListener;
import java.io.*;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        List<Integer> integerList = new ArrayList<>(5);
        Object szStr[] = new String[10];

        exceptions.add(new RuntimeException());
        exceptions.add(new Exception());
        try {
            float i = 1 / 0;
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }
        try {
            int[] arr = new int[2];
            arr[3] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String file = bufferedReader.readLine();
        } catch (IOException e) {
            exceptions.add(e);
        }
        try {
            integerList.get(10);
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            szStr[0] = new Character('b');
        } catch (ArrayStoreException  e) {
            exceptions.add(e);
        }
        try {
            Object o = new Character('g');
            System.out.println((Byte) o);
        } catch (ClassCastException e) {
            exceptions.add(e);
        }
        try {
            int[] nNegArray = new int[-5];
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }
        try {
            szStr = null;
            int i = szStr.length;
        } catch (NullPointerException e) {
            exceptions.add(e);
        }
        try {
            String szShortString = "123";
            char chr = szShortString.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }


        //напишите тут ваш код

    }
}
