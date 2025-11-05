package com.company;

import java.util.ArrayList;

public class CWHarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>();
        // similar foe limked list  and array deque
        l1.add(3);
        l2.add(99);
        l1.add(8);
        l1.add(7);
        l1.add(9);
        l1.add(5);
        l1.add(6);
        l2.add(45);
        l2.add(0,66);
        l1.addAll(l2);
        for(int i=0;i< l1.size();i++){
            System.out.println(l1.get(i));
        }
        System.out.println(l1.contains(1));
        l1.subList(1,4);
    }

}
