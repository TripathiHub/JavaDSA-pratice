package com.himanshu;

public class StringSearch {
    public static void main(String[] args) {
        String name="himanshu";
        boolean result;
        boolean result2;
        result = stringsearch(name,'k');
        result2 = stringsearch(name,'a',3,4);
        System.out.println(result);
        System.out.println(result2);
    }
    static boolean stringsearch(String name,char target,int start,int end){
        if (name == null) {
            return false;
        }
        for (int i = start; i <end ; i++) {
            if(name.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
    static boolean stringsearch(String name,char target){
        if (name.length()==0){
            return false;
        }
        for (int i = 0; i <name.length() ; i++) {
            if (name.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
