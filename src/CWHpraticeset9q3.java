package com.company;
class rectangle{
    int height;
    int length;
    public rectangle(){
        height=4;
        length=6;
    }
    public rectangle(int h,int l){
        height=h;
        length=l;
    }
    public int area(){
        int area;
        area=height*length;
        return area;
    }
}

public class CWHpraticeset9q3
{
    public static void main(String[] args)
    {
       rectangle rec1= new rectangle(8,12);
       rectangle rec2=new rectangle();
        System.out.println(rec1.area());
        System.out.println(rec2.area());
    }
}
