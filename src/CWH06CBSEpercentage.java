import java.util.Scanner;

public class CWH06CBSEpercentage
{
    public static void main(String[] args)
    {
        System.out.println("enter marks of 5 subjects out of 100.");
        System.out.print(" marks of physics: ");
        Scanner sc= new Scanner(System.in) ;
        int p = sc.nextInt();
        System.out.print("marks of chemistry: ");
        int c= sc.nextInt();
        System.out.print("marks of maths: ");
        int m= sc.nextInt();
        System.out.print("marks of english: ");
        int e= sc.nextInt();
        System.out.print("marks of computer: ");
        int com =sc.nextInt();
        float sum= p+c+m+e+com;
        System.out.print("total marks of 5 subject is:");
        System.out.println(sum);
        float avg = sum/500;
        float per= avg*100;
        System.out.print("the percentage of this child is: ");
        System.out.println(per);
    }
}
