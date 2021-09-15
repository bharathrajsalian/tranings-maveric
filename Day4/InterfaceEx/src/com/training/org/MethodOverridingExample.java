
package com.training.org;
class GrandParent{
    void fun(){
        System.out.println("GrandParent fun method");
    }
}

class Parent1 extends GrandParent{
    void fun(){
        System.out.println("Parent1 fun method");
    }
}

class Parent2 extends GrandParent{
    void fun(){
        System.out.println("Parent2 fun method");
    }
}
public class MethodOverridingExample{
    public static void main(String[] args) {
        GrandParent p2=new Parent1();
        p2.fun();
    }
}

