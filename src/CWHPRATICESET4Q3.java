import java.util.Scanner;

public class CWHPRATICESET4Q3
{
    public static void main(String[] args)
    {
        System.out.println("enter number to find days of week");
        Scanner sc =new Scanner(System.in);
        byte a= sc.nextByte();

        switch(a)
        {
            case  1 ->System.out.println("monday");
            case  2 ->System.out.println("tueday");
            case  3 ->System.out.println("wednesday");
            case  4 ->System.out.println("thursday");
            case  5 ->System.out.println("friday");
            case  6 ->System.out.println("saturday");
            case  7 ->System.out.println("sunday");
            default -> System.out.println("invalid choice");
        }
    }
}


