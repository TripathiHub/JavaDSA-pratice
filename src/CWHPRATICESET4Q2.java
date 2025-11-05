import java.util.Scanner;

public class CWHPRATICESET4Q2
{
    public static void main(String[] args)
    {
        System.out.println("enter your income in lakhs");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        float tax = 0f;
        if (amount <= 2.5f) {
            tax = tax + 0f;
        } else if (amount > 2.5f && amount <= 5.0f) {
            tax = tax + 0.05f * (amount - 2.5f);
        } else if (amount > 5.0f && amount <= 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (amount - 5.0f);
        } else if (amount > 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (amount - 10.0f);
        }
        System.out.print("total tax you have to pay: ");
        System.out.println(tax);
    }
}
