package com.training.org;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> a=new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[]{1,3,2,4,8,9,0}));

        System.out.println(a);


        Set<Integer> b=new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[]{1,3,7,5,4,0,7,5}));
        System.out.println(b);


        //to Find union
        Set<Integer> union=new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("Union of the two set"+union);


        //to Find intersection
        Set<Integer> intersection=new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("Intersection of two sets"+intersection);


        //To find the symmetric differences
        Set<Integer> diff=new HashSet<Integer>(a);
        diff.removeAll(b);
        System.out.println("Differences of two sets"+diff);
    }
}
