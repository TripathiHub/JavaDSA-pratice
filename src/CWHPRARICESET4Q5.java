import java.util.Scanner;

public class CWHPRARICESET4Q5
{
    public static void main(String[] args) {
        System.out.println("enter a website");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".com"))
        {
            System.out.println("it is a commercial website");
        }
        else if(website.endsWith(".org"))
        {
            System.out.println("it is a organisation's website");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("it is a indian website ");
        }

    }
}
