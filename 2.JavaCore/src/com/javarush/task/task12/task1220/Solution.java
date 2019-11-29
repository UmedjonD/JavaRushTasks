package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы CanRun, CanSwim
*/

import javax.sql.rowset.CachedRowSet;

public class Solution {
    public static void main(String[] args) {

    }

    abstract public class Human implements CanRun, CanSwim {

    }

    public interface CanRun {
        public void print();
    }

    public interface CanSwim {
        public void print2();
    }

    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут
}
