package com.training.org;

import java.util.Scanner;

public class ForEx {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string");
        String message=input.nextLine();
        String reversedString="";
        int i=message.length()-1;
        do{
            reversedString+=message.charAt(i);
            i--;
        }while (i>=0);

        System.out.println("Reversed String "+reversedString);
        if(message.equals(reversedString))
            System.out.println("pallindrome");
    }
}
