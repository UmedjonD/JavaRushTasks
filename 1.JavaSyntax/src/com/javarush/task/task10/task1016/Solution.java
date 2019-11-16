package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        //своими силами
//        int count = 1;
//        for (int i=0; i<list.size()-1; i++) {
//            if (list.get(i).equals(list.get(i+1))) {
//                count++;
//                result.put(list.get(i),count);
//            } else if (!list.get(i).equals(list.get(i+1))) {
//                result.put(list.get(i), count);
//            }
//            else {
//                count = 1;
//            }
//        }
        //второй способ
        for (String value : list) {
            int count = result.containsKey(value) ? result.get(value) : 0;
            result.put(value, count+1);
        }
        //напишите тут ваш код
        return result;
        //3 способ
//        for (String value : list) {
//            if (result.putIfAbsent(value, 1) != null) result.put(value, result.get(value)+1);
//        }
//        return result;
    }

}

