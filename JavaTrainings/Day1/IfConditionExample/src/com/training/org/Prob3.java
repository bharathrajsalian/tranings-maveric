package com.training.org;

import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3= scanner.nextInt();
        int num4= scanner.nextInt();
        int num5= scanner.nextInt();

        if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5)
            System.out.println("num1 is greater than others");
        else if(num2 > num3 && num2 > num4 && num2 > num5)
            System.out.println("num2 is greater than others");
        else if(num3 > num4 && num3 > num5)
            System.out.println("num3 is greater than others");

    }
}
