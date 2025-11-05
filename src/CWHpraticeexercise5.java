import java.util.Scanner;

public class CWHpraticeexercise5
{
    public static void main(String[] args)
    {
        System.out.print("the number of kilometers : ");
        Scanner sc= new Scanner(System.in);
        double a=sc.nextDouble();
        double mile= a*0.621;
        System.out.print("miles: ");
        System.out.println(mile);
    }
}
