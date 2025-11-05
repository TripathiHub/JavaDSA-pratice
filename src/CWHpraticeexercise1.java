package  com.company;


import java.util.Scanner;

public class CWHpraticeexercise1
{
    public static void main(String[] args)
    {
        System.out.println("enter 3 value for addition");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        int sum=a+b+c;
        System.out.println("the sum is :");
        System.out.print(sum);

    }
}
