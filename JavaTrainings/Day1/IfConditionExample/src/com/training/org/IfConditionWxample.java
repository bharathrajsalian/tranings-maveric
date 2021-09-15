package com.training.org;


import java.util.Scanner;

public class IfConditionWxample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the marks ");
        int mark1= scanner.nextInt();
        int mark2= scanner.nextInt();
        int mark3= scanner.nextInt();
        int mark4= scanner.nextInt();
        int mark5= scanner.nextInt();

        int total = mark1 + mark2 + mark3 + mark4 +mark5;
        float avg = total/5;
        if(avg > 90)
            System.out.println("grade A");
        else if(avg > 70)
            System.out.println("grade B");
        else if(avg > 50)
            System.out.println("Grade C");
        else
            System.out.println("Grade D");

    }
}
