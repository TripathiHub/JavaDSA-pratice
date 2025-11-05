
package com.company;
class greet extends  Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("good morning");
            i++;
        }
    }
}
class welcome extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            try{
                Thread.sleep(20);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println("welcome");
            i++;
        }
    }
}
public class CWHpraticset13qall
{
    public static void main(String[] args) {
        greet t1= new greet();
        welcome t2= new welcome();
        t1.start();
        t2.start();
        t1.setPriority(1);
        t2.setPriority(10);
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
       // t1.getPriority();
      //  t2.getPriority();

    }
}
