package com.training.org;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyPackageClass {
    public static void main(String[] args) throws IOException {

        int num1  = Integer.parseInt(JOptionPane.showInputDialog("enter first number"));
        int num2  = Integer.parseInt(JOptionPane.showInputDialog("enter first number"));

        int num = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
        // System.out.println(num);
        int digit=0;
        int sum=0;
        while( num> 0)
        {
            //System.out.println(num);
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Sum of Digits: "+sum);
    }
}
