package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double ax = x1 - x2;
        double ay = y1 - y2;
        double res = Math.sqrt((ax * ax) + (ay * ay));
        return res;
    }

    public static void main(String[] args) {

    }
}
