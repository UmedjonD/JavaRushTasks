package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();
//        int[] arr1 = new int[5];
//        int[] arr2 = new int[2];
//        int[] arr3 = new int[4];
//        int[] arr4 = new int[7];
//        int[] arr5 = new int[0]; второй способ
//        list.add(arr1);
//        list.add(arr2);
//        list.add(arr3);
//        list.add(arr4);
//        list.add(arr5);
        list.add(new int[]{2, 3, 4, 5, 6});
        list.add(new int[]{5, 6});
        list.add(new int[]{2, 3, 4, 5});
        list.add(new int[]{2, 3, 4, 5, 6, 7, 8});
        list.add(new int[0]);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
