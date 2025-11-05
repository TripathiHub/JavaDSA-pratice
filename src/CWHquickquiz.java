package com.company;
class animal {
    public void speak() {
        System.out.println("they cannot speak like humans");
    }

    public void legs() {
        System.out.println("they have four legs");
    }

    public void mindset() {
        System.out.println("they donot have mindset like humans");
    }
}
    class dog extends animal{
        public void speak(){
            System.out.println("their language is barking");
        }
        public void behaviour(){
            System.out.println("they are more loyal than humans");
        }
    }


public class CWHquickquiz
{
    public static void main(String[] args)
    {
        dog d1= new dog();
        d1.speak();
        d1.legs();
        d1.mindset();
        //d1.language();
        d1.behaviour();
    }
}
