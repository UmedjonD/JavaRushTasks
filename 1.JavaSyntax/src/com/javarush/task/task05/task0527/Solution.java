package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //напишите тут ваш код
        Cat cat = new Cat("Tom",4,6);

        Dog dog = new Dog("Barbos",10,12);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Cat {
        String name;
        int age;
        int weaight;

        public Cat(String name, int age, int weaight) {
            this.name = name;
            this.age = age;
            this.weaight = weaight;
        }
    }
    public static class Dog {
        String name;
        int age;
        int suck;

        public Dog(String name, int age, int suck) {
            this.name = name;
            this.age = age;
            this.suck = suck;
        }
    }

    //напишите тут ваш код
}
