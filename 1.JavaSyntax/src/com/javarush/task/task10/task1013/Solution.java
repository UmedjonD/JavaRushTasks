package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstName;
        private String lastName;
        private int age;
        private int yeard;
        private String city;
        private String country;

        public Human() {
        }

        public Human(String firstName) {
            this.firstName = firstName;
        }

        public Human(int age) {
            this.age = age;
        }

        public Human(String lastName, int age) {
            this.lastName = lastName;
            this.age = age;
        }

        public Human(int yeard, String city) {
            this.yeard = yeard;
            this.city = city;
        }

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String firstName, String lastName, int age, int yeard) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.yeard = yeard;
        }

        public Human(String firstName, String lastName, int age, int yeard, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.yeard = yeard;
            this.city = city;
        }

        public Human(String firstName, String lastName, int age, int yeard, String city, String country) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.yeard = yeard;
            this.city = city;
            this.country = country;
        }
        // Напишите тут ваши переменные и конструкторы
    }
}
