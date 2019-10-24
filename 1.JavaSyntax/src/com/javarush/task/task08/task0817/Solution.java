package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;


/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        Map<String , String> map = new HashMap<>();
        map.put("Davlatov","Umedjon");
        map.put("Aliev","Mansur");
        map.put("Atoev","Azim");
        map.put("Azamov","Azam");
        map.put("Azizova","Fatima");
        map.put("Latipov","Fayzullo");
        map.put("Sobirov","Umedjon");
        map.put("Umedov","Umedjon");
        map.put("Otaev","Umedjon");
        map.put("Otaeva","Oisha");

        return (HashMap<String, String>) map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        //Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        //HashMap<String, String> copy = new HashMap<String, String>(map);

        String[] names = map.values().toArray(new String[0]);
        HashSet<String> tmp = new HashSet<>();
        for (String s : names) {
            if (tmp.contains(s)) removeItemFromMapByValue(map,s);
            else tmp.add(s);
        }



    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
