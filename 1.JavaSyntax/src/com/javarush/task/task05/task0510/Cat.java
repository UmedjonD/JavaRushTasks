package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name = "Smith";
    int age = 5;
    int weight = 4;
    String color = "red";
    String address = "Blala";

    public void initialize(String name) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.address = null;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.address = null;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.address = null;
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 2;
        this.name = null;
        this.address = null;

    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = age;
        this.name = null;

    }

    public static void main(String[] args) {

    }
}
