package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top;
    int left;
    int width;
    int height;

    public void initialize(int i){
        this.top = i;
    }
    public void initialize(int i, int b) {
        this.top = i;
        this.left = b;
    }
    public  void initialize(int i, int b, int c) {
        this.top = i;
        this.left = b;
        this.width = c;
    }

    public void initialize(int i, int b, int c, int a) {
        this.top = i;
        this.left = b;
        this.width = c;
        this.height = a;
    }

    public static void main(String[] args) {

    }
}
