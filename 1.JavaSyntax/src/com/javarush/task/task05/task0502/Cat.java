package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        if (this.age > anotherCat.age && this.weight > anotherCat.weight && this.strength > anotherCat.strength) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Cat cat1 = new Cat();
//        Cat cat2 = new Cat();
//
//
//        cat1.fight(cat2);
//        cat2.fight(cat1);

    }
}
