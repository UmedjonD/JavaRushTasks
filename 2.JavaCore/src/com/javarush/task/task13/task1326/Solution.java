package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader readerConsole = new BufferedReader(new InputStreamReader(System.in));
        String filname = readerConsole.readLine();
        InputStream inputStream = new FileInputStream(filname);
        readerConsole.close();

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        List<Integer> list = new ArrayList<>();

        try {
            String line;

            while ((line = reader.readLine()) != null) {
                int x = Integer.parseInt(line);
                if (x % 2 == 0) {
                    list.add(x);
                }
            }
            Collections.sort(list);

            for (Integer i : list) {
                System.out.println(i);
            }


            reader.close();
            inputStream.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
