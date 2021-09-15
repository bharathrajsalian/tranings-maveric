package com.training.org;

public class Complex {
    private int real;
    private int img;
    public void showDetails(){
        System.out.println("real " + real + "img " + img);
    }

    public static void main(String[] args) {
        Complex cx1 = new Complex();
        cx1.showDetails();
    }
}
