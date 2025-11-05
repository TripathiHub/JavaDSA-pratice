package com.company;
class monkey{
    public void jump(){
        System.out.println("jumping");
    }
    public void bite(){
        System.out.println("biting");
    }
}
interface basicAnimals{
    public void eat();
    public void sleep();
}
class human extends monkey implements basicAnimals{
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }

}

public class CWHpraticeset11q2
{
    public static void main(String[] args)
    {
     human h1=new human();
     monkey m1= new human();
     h1.eat();
     h1.sleep();
     h1.bite();
     h1.jump();
     m1.jump();
     m1.bite();
    // m1.eat(); tihs is not allowed because we have made reference of monkey only
    }
}
