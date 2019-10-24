package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код

        Map<String,String> map = new HashMap<String , String>();
        map.put("Davlatov", "Umedjon");
        map.put("Atoeva", "Mansur");
        map.put("Sobirov", "Umedjon");
        map.put("Bahromov", "Bahrom");
        map.put("Akbarov", "Muhammad");
        map.put("Davlatpochoev", "Malika");
        map.put("Zaydzoda", "Muhammad");
        map.put("Latipov", "Fayzik");
        map.put("Fayzaliev", "Tabarali");
        map.put("Atoev", "Azim");

        return (HashMap<String, String>) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        int k = 0;
        while (iterator.hasNext()){

            Map.Entry<String, String> pair = iterator.next();

            if(pair.getValue().equals(name)){
                k++;
            }
        }
        return k;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        /**Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int k =1;
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            if(pair.getKey().equals(pair.getKey())){
                k++;
            }
        }
         **/
        return map.containsKey(lastName)? 1:0;

    }

    public static void main(String[] args) {
        //HashMap<String, String> map = createMap();
        //System.out.println(getCountTheSameFirstName(map, "Светлана"));
        //System.out.println(getCountTheSameLastName(map, "Петров"));

    }
}
