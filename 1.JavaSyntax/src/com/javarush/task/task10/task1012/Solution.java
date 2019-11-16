package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
            Collections.sort(alphabet);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        List<Character> listChar = new ArrayList<>();
        List<Integer> listint = new ArrayList<>();
        int count = 0;
        System.out.println("start");

        for (int i=0; i<list.size(); i++) {
            String s = list.get(i);
                for (int j=0; j<s.length(); i++) {
                    char ch = s.charAt(j);
                    if (alphabet.contains(ch)) {
                        listChar.add(ch);
                        listint.add(j);
                    }
                }
        }
        for (int i=0; i<listChar.size(); i++) {
            System.out.println(listChar.get(i) + " " + listint.get(i));
        }
        // напишите тут ваш код
    }
}
