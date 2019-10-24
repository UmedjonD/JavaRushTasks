package com.javarush.task.task08.task0813;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        set.add("Лупа");
        set.add("Лула");
        set.add("Лола");
        set.add("Лолах");
        set.add("Лупахон");
        set.add("Лупача");
        set.add("Лупаси");
        set.add("Лупан");
        set.add("Лупау");
        set.add("Лупы");
        set.add("Лупм");
        set.add("Лупва");
        set.add("Лупцу");
        set.add("Лупай");
        set.add("Лупабо");
        set.add("Лупачон");
        set.add("Лупаёо");
        set.add("Лупаар");
        set.add("Лупаы");
        set.add("Лупак");
        return set;
    }

    public static void main(String[] args) {

    }
}
