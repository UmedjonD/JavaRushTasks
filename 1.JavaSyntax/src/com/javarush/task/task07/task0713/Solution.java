package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> seconList = new ArrayList<>();
        ArrayList<Integer> thirdList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            list.add(Integer.valueOf(reader.readLine()));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                firstList.add(list.get(i));
            }
            if (list.get(i) % 2 == 0) {
                seconList.add(list.get(i));
            }
            if (list.get(i) % 3 != 0 && list.get(i) % 2 != 0) {
                thirdList.add(list.get(i));
            }
        }
        printList(firstList);
        printList(seconList);
        printList(thirdList);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
