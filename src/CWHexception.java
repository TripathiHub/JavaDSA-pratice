import java.util.Scanner;

public class CWHexception {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[1] = 56;
        marks[0] = 70;
        marks[2] = 72;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index of array of which you want get marks");
        int ind = sc.nextInt();
        System.out.println("enter number you want to divide by marks");
        int num = sc.nextInt();
        try {
            System.out.println("the marks of index "+ marks[ind]);
            System.out.println("the result of array-index/number is : " + marks[ind] / num);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bond exception occur");
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println("Arthematic exception occur");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("some other exception occur");
            System.out.println(e);
        }
    }
}
