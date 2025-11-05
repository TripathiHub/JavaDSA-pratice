package com.company;
abstract class pen{
  abstract  public void write();
}
class fountainPen{
    public void write(){
        System.out.println("writing");
    }
    public void refill(){
        System.out.println("refilling");
    }
    public void changeNib(){
        System.out.println("changing the nib");
    }
}
public class CWHpraticeset11q1
{
    public static void main(String[] args)
    {
         fountainPen pen1=new fountainPen();
         pen1.changeNib();
         pen1.refill();
         pen1.write();
    }
}
