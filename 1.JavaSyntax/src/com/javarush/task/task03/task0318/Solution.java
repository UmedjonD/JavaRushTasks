package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String yeard = reader.readLine();
        int i = Integer.parseInt(yeard);
        String name = reader.readLine();
        System.out.println(name + " захватит мир через " + i + " лет. Му-ха-ха!");
    }
}
