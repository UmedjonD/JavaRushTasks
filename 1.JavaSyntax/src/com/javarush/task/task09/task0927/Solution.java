package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<>();
        map.put("Kotik", new Cat("Barsik"));
        map.put("Kotik2", new Cat("Barsik"));
        map.put("Koti3", new Cat("Barsik"));
        map.put("Kotik4", new Cat("Barsik"));
        map.put("Koti5", new Cat("Barsik"));
        map.put("Koti6", new Cat("Barsik"));
        map.put("Koti7", new Cat("Barsik"));
        map.put("Koti8", new Cat("Barsik"));
        map.put("Koti9", new Cat("Barsik"));
        map.put("Kotik10", new Cat("Barsik"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set set = new HashSet(map.values());
        return set;
        //напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
