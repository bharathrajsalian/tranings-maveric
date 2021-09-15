package com.training.org;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        int sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of iterations");
        int number=input.nextInt();

        while(number>=0){
            sum+=number;
            number--;
        }

        System.out.println("sum of elements "+sum);

        int i=0;
        do{
            System.out.println("Value of i "+i);
            i++;
        }while(i<=10);
    }
}
