
package com.company;
import java.util.Scanner;

class myexception extends Exception{
    @Override
   public String toString(){
        return "exception occur: age is beyond limit";
    }
    @Override
    public String getMessage(){
        return "enter correct value of age";
    }

   // @Override
   // public void printStackTrace() {
     //   System.out.println();

}
public class CWHEXCEPTIONCLASS
{
    public static void main(String[] args) {
        boolean flag=true;
        int a;
        while(flag) {
            System.out.println("enter your age");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            try {
                if (a > 125) {
                    throw new myexception();
                    //throw new  ArithmeticException("arthematic exception occue");
                } else{
                    System.out.println("your data is collected");
                    flag=false;
                }
            } catch (Exception e) {
               // System.out.println(e); this will give output of toString method
                System.out.println(e.getMessage());
               System.out.println(e.toString());
                //  System.out.println("finaly aLL eXCEPTION caputerd");
               // e.printStackTrace();
                System.out.println("finaly all EXCEPTION caputered");
                System.out.println("try again");
            }
        }
    }
}
