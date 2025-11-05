package com.company;
class circle
{
    int radius;
    public circle(int radius){
        this.radius=radius;
    }
    public double area(){
        double area;
        area=3.14*radius*radius;
        return area;
    }
}
class cl extends circle{
    int height;
    public cl(int height){super(5);
        //this.radius=radius;
        this.height=height;
    }
    public double area(){
        double area;
        area=2*3.14*radius*radius + 2*3.14*radius*height;
        return area;
    }
    public double volume(){
        double volume;
        volume=(4/3)*(3.14*radius*radius*radius);
        return volume;
    }
}


public class CWHpraticeset10q1
{
    public static void main(String[] args)
    {
       circle c1= new circle(5);
       cl c2= new cl(8);
        System.out.println(c2.area());
       //ss System.out.println(c1.area());
        System.out.println(c2.volume());
    }
}
