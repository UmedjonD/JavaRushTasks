package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        try {
            FileWriter fileWriter = new FileWriter(reader.readLine());
            Writer bufferedWriter = new BufferedWriter(fileWriter);
            boolean flag = true;

            while(flag) {
                String s = reader.readLine();
                list.add(s);
                if (s.equals("exit")) {
                    flag = false;
                }
            }

            for (String s : list) {
                bufferedWriter.write(s + "\n");

            }

            bufferedWriter.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
