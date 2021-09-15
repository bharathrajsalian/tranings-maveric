package com.training.org;

public class WhileEx4 {
    public static void main(String[] args) {
        int i=0;
        for(;i<=10;){
//            if(i>10){
//                break;
//            }
            System.out.println("Value of i"+i);
            i++;
        }

        String name[]={"Chiku","Annu","Mannnu","Chintu","Pappu"};
        String message="Hello World";
        for(String str:name)
            System.out.println(str);

        for(char ch:message.toCharArray())
            System.out.println(ch);



    }
}
