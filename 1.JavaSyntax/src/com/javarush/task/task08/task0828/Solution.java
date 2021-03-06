package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        Map<String, String> map = new HashMap<String, String>();
        map.put("January", "January is the 1 month");
        map.put("February", "February is the 2 month");
        map.put("March", "March is the 3 month");
        map.put("April", "April is the 4 month");
        map.put("May", "May is the 5 month");
        map.put("June", "June is the 6 month");
        map.put("July", "July is the 7 month");
        map.put("August", "August is the 8 month");
        map.put("September", "September is the 9 month");
        map.put("October", "October is the 10 month");
        map.put("November", "November is the 11 month");
        map.put("December", "December is the 12 month");

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            if (key.toUpperCase().equals(month.toUpperCase()))
                System.out.println(value);
        }
    }
    /*второй спсособ
    * BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, String> map = new HashMap<>();
        String str = reader.readLine();

        map.put(1, "January");
        map.put(2, "February");
        map.put(3, "March");
        map.put(4, "April");
        map.put(5, "May");
        map.put(6, "June");
        map.put(7, "July");
        map.put(8, "August");
        map.put(9, "September");
        map.put(10, "October");
        map.put(11, "November");
        map.put(12, "December");

        for (Map.Entry<Integer, String> pair : map.entrySet()) {

            int key = pair.getKey();
            String value = pair.getValue();

            if (str.equals(value))
                System.out.println(value + " is the " + key + " month");
        }
    * */
}
