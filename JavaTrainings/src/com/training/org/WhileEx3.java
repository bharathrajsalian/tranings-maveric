    package com.training.org;

    import java.util.Scanner;

    public class WhileEx3 {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);

            char ch;
           int choice;
            do{
                System.out.println("Enter first number");
                int num1=input.nextInt();

                System.out.println("Enter second number");
                int num2=input.nextInt();

                System.out.println("1] Addition\n2] Subtraction\n3] Mulitplication\n4] Division\n\nEnter your choice\n");
                choice=input.nextInt();

                switch (choice){
                    case 1:
                        System.out.println("Addition -> "+(num1+num2));
                        break;

                    case 2:
                        System.out.println("Subtraction -> "+(num1-num2));
                        break;
                    case 3:
                        System.out.println("Multiplcation -> "+(num1*num2));
                        break;
                    case 4:
                        System.out.println("Division -> "+(float)(num1/(float)num2));
                        break;
                }

                System.out.println("Do you want to continue....");
                ch=input.next().charAt(0);

            }while(ch=='Y'||ch=='y');

        }
    }
