package com.himanshu;
 public class base{
    public base(){
        System.out.println("i am constructor of base");
    }
    public base(int a){
        System.out.println("i am constructor of base with vlaue of a:" +a);
    }
}
 class derived extends base{
    public derived(){
        System.out.println("i am construvtor of derived");
    }
    public derived(int a,int b) {super(2);
        System.out.println("i am construcotr of derived with value of b: " + b);
    }
}
class chlid extends derived{
    public chlid(){
        System.out.println("i amn constructor of chlid");
    }
    public chlid(int a,int b,int c){ super(2,3);
        System.out.println("i am constructor of chlid with value of c: " + c);
    }
}


