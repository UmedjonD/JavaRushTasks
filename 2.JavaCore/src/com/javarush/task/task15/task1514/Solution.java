package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(2.0, "gf");
        labels.put(1.0, "gf");
        labels.put(5.0, "gf");
        labels.put(6.0, "gf");
        labels.put(8.0, "gf");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}