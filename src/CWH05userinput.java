import java.util.Scanner;

public class CWH05userinput
{
    public static void main(String[] args)
    {
        System.out.println("taking input from user");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number for addition");
        int a=sc.nextInt();
        System.out.println("enter second for addition");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println("the sum of two numbers is :");
        System.out.println(sum);
    }

}
