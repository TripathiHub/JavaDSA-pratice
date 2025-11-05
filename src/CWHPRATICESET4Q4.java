import java.util.Scanner;

public class CWHPRATICESET4Q4
{
    public static void main(String[] args)
    {
        System.out.println("enter year to check it is a leap year or not.");
        Scanner sc= new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("it is a leap year");
        }
        else{
            System.out.println("it is not aleap year.");
        }
    }
}
