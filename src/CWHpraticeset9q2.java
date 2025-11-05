package com.company;
class Cylinder{
    float radius;
    float height;
    public void setRadius(float r){
        radius=r;
    }
    public void setHeight(float h){
        height=h;
    }
    public float getRadius(){
        return radius;
    }
    public float getHeight(){
        return height;
    }
    public double surfacearea(){
        double surarea;
        surarea=2*3.14*radius*height + 2*3.14*radius*radius;
        return surarea;
    }
    public double volume(){
        double volume;
        volume=2*3.14*radius*height;
        return volume;
    }
}
public class CWHpraticeset9q2
{
    public static void main(String[] args)
    {
        Cylinder c1=new Cylinder();
        c1.setRadius(2);
        c1.setHeight(5);
        System.out.println(c1.getRadius());
        System.out.println(c1.getHeight());
        System.out.println(c1.surfacearea());
        System.out.println(c1.volume());
    }
}
