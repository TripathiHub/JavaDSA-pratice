package com.company;
interface tvRemote {
    public void forward();

    public void backward();
}
interface smartTvRemote extends tvRemote{
    public void youtube();
    public void google();
}
class tv implements smartTvRemote{
    public void backward(){
        System.out.println("changing channel back");
    }
    public void forward(){
        System.out.println("changing channel forward");
    }
    public void youtube(){
        System.out.println("connecting youtube");
    }
    public void google(){
        System.out.println("connecting google");
    }
}

public class CWHPRATICESET11Q4
{
    public static void main(String[] args) {
        tv tv= new tv();
        tv.backward();
        tv.forward();
        tv.google();
        tv.youtube();

    }
}
