package com.training.org;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the qty of laptops");
        int laptop = scanner.nextInt();
        System.out.println("Enter the qty of USB");
        int USB = scanner.nextInt();
        System.out.println("Enter the qty of keybords");
        int keyboard = scanner.nextInt();

        double totalAmt = (laptop * 300) + (USB * 50) + (keyboard * 20);
        System.out.println(totalAmt);
       // double discoutedAmt = 0;
        if(totalAmt > 1500){
            totalAmt = totalAmt - ((totalAmt * 15)/100);
        }
        System.out.println(totalAmt);
    }
}

