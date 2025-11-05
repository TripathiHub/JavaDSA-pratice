package com.company;
class mythread1 implements Runnable{
   public void run(){
        int i=0;
        while(i<100){
            System.out.println("thread 111");
            i++;
        }
    }
}
class mythread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("thread 222");
            i++;
        }
    }
}
public class CWHthread2
{
    public static void main(String[] args)
    {
      mythread1 t1= new mythread1();
      mythread2 t2= new mythread2();
      Thread th1= new Thread(t1);
      Thread th2= new Thread(t2);
      th1.start();
      th2.start();
    }
}
