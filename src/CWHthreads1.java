package com.company;
class thread1 extends Thread {
   public thread1(String name){
        super(name);
    }
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            try {
                Thread.sleep(455);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(" thread 111"+ getName());
            i++;
        }
    }
}
    class thread2 extends Thread {
        @Override
        public void run() {
            int i = 0;
            while (i < 100) {
                System.out.println("thread 222");
                i++;
            }
        }

}
public class CWHthreads1 {
    public static void main(String[] args) {
      thread1 t1=new thread1("com/himanshu");
        thread1 t3=new thread1("om");
        thread1 t4=new thread1("nihal");
        thread1 t5=new thread1("ansh");
        thread2 t2=new thread2();
      t1.start();
      try{
          t1.join();
      }catch(Exception e){
          System.out.println(e);
      }
      t2.start();
      t3.start();
      t4.start();
      t5.start();
      t1.setPriority(Thread.NORM_PRIORITY);
      t3.setPriority(Thread.MAX_PRIORITY);
      t4.setPriority(Thread.MAX_PRIORITY);
      t5.setPriority(Thread.MIN_PRIORITY);
       // System.out.println(t1.getName());
        //System.out.println(t1.getId());

    }
}
