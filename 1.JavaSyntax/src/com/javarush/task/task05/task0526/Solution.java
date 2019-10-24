package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Man man = new Man("Umed", 24, "Dushanbe");
        Man man2 = new Man("Joni", 25, "Rudaki");
        Woman woman2 = new Woman("zohir",22,"Vahdat");
        Woman woman = new Woman("Dilshod", 23, "Sochi");

        man.show();
        man2.show();
        woman.show();
        woman2.show();
    }

    //напишите тут ваш код
    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public void show() {
            System.out.println(name + " " + age + " " + address);
        }

        @Override
        public String toString() {
            return "name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    '}';
        }

    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public void show() {
            System.out.println(name + " " + age + " " + address);
        }

        @Override
        public String toString() {
            return "name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    '}';
        }

    }
}
