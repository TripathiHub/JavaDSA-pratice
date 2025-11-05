import java.util.InputMismatchException;
import java.util.Scanner;

 class CWYHquickquiz
{
    public static void main(String[] args)
    {
        int [] marks= new int[3];
        marks[0]=78;
        marks[1]=56;
        marks[2]=46;
        Scanner sc= new Scanner(System.in);
        boolean flag=true;
        while(flag) {
            try {
                System.out.println("hyy good morning");
                try {
                    System.out.println("enter index number of array");
                    int ind = sc.nextInt();
                    // System.out.println(ind);
                    System.out.println("marks at above index is " + marks[ind]);
                    flag = false;
                } catch (Exception e) {
                    System.out.println("Exception at level 2");
                    System.out.println(e);
                }
            } catch (InputMismatchException e) {
                System.out.println("Exception at level 1");
                System.out.println(e);
            }
        }

        System.out.println("end of program");
    }


}
