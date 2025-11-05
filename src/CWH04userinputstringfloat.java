
import java.util.Scanner;

public class CWH04userinputstringfloat
{
    public static void main(String[] args)
    {
        System.out.println("enter a integer");
        Scanner sc= new Scanner(System.in);
        boolean b1= sc.hasNextFloat();
        System.out.println(b1);
    }
}
