package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         List<Integer> chisla = new ArrayList<>();
//        int[] chisla = new int[5];
        //напишите тут ваш код
        for (int i = 0; i<5; i++) {
            int number = Integer.parseInt(reader.readLine());
            chisla.add(number);
        }
        Collections.sort(chisla);
//        Arrays.sort(chisla);
        for (int i = 0; i<chisla.size(); i++) {
            System.out.println(chisla.get(i));
        }
//        System.out.println(Arrays.toString(chisla));
        // сделал сортировку и с массивом и с листом , я крутой


    }
}
