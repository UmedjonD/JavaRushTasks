package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Davlatov",100);
        map.put("Sobirov",200);
        map.put("Latipov",500);
        map.put("Azizov",600);
        map.put("Aliev",300);
        map.put("Atoev",400);
        map.put("Azimov",900);
        map.put("Otaeva",1000);
        map.put("Otaev",1000);
        map.put("Ota",1000);


        return (HashMap<String, Integer>) map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);

        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }

    }

    public static void main(String[] args) {

    }
}