package com.training.org;


public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            try {
                try {
                    int arr[] = {10, 20, 30, 40, 50};
                    System.out.println(arr[10]);
                } catch (ArithmeticException e) {
                    System.out.println(e);
                }
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}