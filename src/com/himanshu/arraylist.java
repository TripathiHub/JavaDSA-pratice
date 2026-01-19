package com.himanshu;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        list2.add( new ArrayList<Integer>());
        list2.add( new ArrayList<Integer>());
        list2.add( new ArrayList<Integer>());
        list2.get(0).add(4315);
        list2.get(0).add(4135);
        list2.get(0).add(4153);
        list2.get(1).add(425);
        list2.get(2).add(345);
        System.out.println(list2);
        list.add(451);
        list.add(4512);
        list.add(45123);
        list.add(451234);
        list.add(45678901);
        list.add(4567890);
        list.add(456789);
        list.add(45678);
        list.add(4567);
        list.add(456);
       // System.out.println(list);
        for(int i : list){
            System.out.println(i);
        }
    }
}
