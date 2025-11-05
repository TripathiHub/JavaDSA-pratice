package com.company;
class sphere1{
    float radius;
    public void setradius(float r){
        radius=r;
    }
    public float getradius(){
        return radius;
    }
    public double area(){
        double area;
        area=4*3.14*radius*radius;
        return area;
    }
    public  double volume(){
        double volume;
        volume=(4/3)*(3.14*radius*radius*radius);
        return volume;
    }
}

public class CWHprarticeset9q5
{
    public static void main(String[] args)
    {
      sphere1 s1= new sphere1();
      s1.setradius(4.5f);
        System.out.println(s1.area());
        System.out.println(s1.volume());
    }
}
