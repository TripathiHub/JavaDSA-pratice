package com.company;
class rec{
    int breath;
    int length;
    public rec(int breath,int length){
        this.breath=breath;
        this.length=length;
    }
    public int area(){
        int area;
        area=length*breath;
        return area;
    }
}
class cuboid extends rec{
    int height;
    public cuboid(int height){super(5,6);
        this.height=height;
    }
    public int tsa(){
        int tsa;
        tsa=2*((length*breath) + (breath*height)+ (height*length));
        return tsa;
    }
    public int volume(){
        int volume;
        volume=length*breath*height;
        return volume;

    }

}

public class CWHpraticeset10q2
{
    public static void main(String[] args)
    {
    rec r1=new rec(5,6);
    cuboid c1= new cuboid(7);
        System.out.println(r1.area());
        System.out.println(c1.tsa());
        System.out.println(c1.volume());
    }
}
