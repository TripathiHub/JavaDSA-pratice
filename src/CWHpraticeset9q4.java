package com.companuy;
class sphere{
    float radius;
    public sphere(){
        radius=5.78f;
    }
    public sphere(float r){
        radius=r;
    }
    public double area(){
        double area;
        area=4*3.14*radius*radius;
        return area;
    }
    public double volume(){
        double volume;
        volume=(4/3)*(3.14*radius*radius*radius);
        return volume;
    }
}

public class CWHpraticeset9q4
{
    public static void main(String[] args)
    {
       sphere s1= new sphere();
        sphere s2= new sphere(7.18f);
        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s1.volume());
        System.out.println(s2.volume());
    }
}
