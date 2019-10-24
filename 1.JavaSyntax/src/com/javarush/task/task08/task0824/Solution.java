package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> childrenNull = new ArrayList<>();

        Human childs1 = new Human("Rustam", true, 21, childrenNull);
        Human childs2 = new Human("Umed", true, 23, childrenNull);
        Human childs3 = new Human("Aisha", false, 15, childrenNull);

        ArrayList<Human> children = new ArrayList<>();
        Collections.addAll(children, childs1 , childs2, childs3);

        ArrayList<Human> parents1 = new ArrayList<>();
        ArrayList<Human> parents2 = new ArrayList<>();
        Human father = new Human("Sobir", true, 55, children);
        Human mother = new Human("Muborak", false, 53, children);

        Collections.addAll(parents1, father);
        Collections.addAll(parents2, mother);

        Human bobo1 = new Human("Bobo1", true, 75, parents1);
        Human momo1 = new Human("Momo1", false, 74, parents1);
        Human bobo2 = new Human("Bobo2", true, 75, parents2);
        Human momo2 =new Human("Momo2", false, 74, parents2);

        ArrayList<Human> people = new ArrayList<>();
        Collections.addAll(people, bobo1, momo1 , bobo2, momo2, father,  mother, childs1, childs2, childs3);

        for (int i = 0; i<people.size(); i++) {
            System.out.println(people.get(i));
        }

    }

    public static class Human {
        //напишите тут ваш код
         String name;
         boolean sex;
         int age;
         ArrayList<Human> children;

        public Human(String name,  boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
