package com.training.org;

interface Drawable{
    public void draw();
}

class Rectangle implements Drawable{

    @Override
    public void draw() {
        System.out.println("Draw from Rectangle");
    }
}

class Circle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Draw from Circle");
    }
}



public class InterfaceExample {
    public static void main(String[] args) {
        Drawable d1=new Rectangle();
        d1.draw();

        d1=new Circle();
        d1.draw();

    }
}

