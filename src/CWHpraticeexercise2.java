import java.util.Scanner;

public class CWHpraticeexercise2
{
    public static void main(String[] args)
    {
        System.out.println("enter marks of your 3 subject");
        Scanner sc = new Scanner(System.in);
        float a= sc.nextInt();
        float b=sc.nextInt();
        float c= sc.nextInt();
        float sum= a+b+c;
        float cgpa=sum/30;
        System.out.println(cgpa);
    }
}
