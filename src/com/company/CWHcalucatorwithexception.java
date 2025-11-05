package com.company;

import java.util.Scanner;

class invalidinputException extends Exception{
    @Override
    public String toString() {
        return "invalid input";
    }
}
class MaxinputException extends Exception{
    @Override
    public String toString() {
        return "max input Exception";
    }
}
class cannotdividebyzeroException extends Exception{
    @Override
    public String toString() {
        return "cannot divide by zero Exception";
    }
}
class MaxmultiplyException extends Exception{
    @Override
    public String toString() {
        return "max mutliply Exception occur";
    }
}
class calucator {
    int addition() throws MaxinputException,invalidinputException {
        System.out.println("enter two value fo addition");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
            if (a == 8 || b == 8 || a == 9 || b == 9) {
                throw new invalidinputException();
            } else if (a > 100000 || b > 100000) {
                throw new MaxinputException();
            }
        System.out.print("the answer of addition is: ");
            int c = a + b;
            return c;
        }


    int subract() throws MaxinputException {
        System.out.println("enter two value for substraction");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > 100000 || b > 100000) {
            throw new MaxinputException();
        }
        System.out.print("the answer of subraction is: ");
            int c = a - b;
            return c;
    }

    int divide() throws MaxinputException,cannotdividebyzeroException {
        System.out.println("enter two value for division");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ( b == 0) {
            throw new cannotdividebyzeroException();
        } else if (a > 100000 || b > 100000) {
            throw new MaxinputException();
        }
        System.out.print("the ansser of division is: ");
        int c = a / b;
        return c;
    }


    int multiply() throws MaxinputException,MaxmultiplyException{
        System.out.println("enter two value for mutliplication");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

            if(a>100000 || b>100000){
                throw new MaxinputException();
            } else if(a>7000 || b>7000){
                throw new MaxmultiplyException();
            }
        System.out.print("the answer of multiplication is: ");
            int c= a*b;
            return  c;
        }

   }
public class CWHcalucatorwithexception
{
    public static void main(String[] args) throws MaxinputException,MaxmultiplyException,invalidinputException,cannotdividebyzeroException {
        calucator c1= new calucator();
        System.out.println(c1.addition());
        System.out.println(c1.subract());
        System.out.println(c1.multiply());
        System.out.println(c1.divide());
    }
}
