package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = null;
        String txt = reader.readLine();
        try {
            inputStream = new FileInputStream(txt);

            while (inputStream.available() > 0) {
                int data = inputStream.read();
                System.out.print((char) data);
            }
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}