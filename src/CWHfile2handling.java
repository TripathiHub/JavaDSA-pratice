import java.io.FileWriter;
import java.io.IOException;

public class CWHfile2handling {
    public static void main(String[] args) {
        int i = 9;
        String table9 = "";
        for (int j = 1; j < 11; j++) {
            table9 += i + "X" + j + "=" + i * j;
            table9 += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("multlipication9.txt");
            fileWriter.write(table9);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int n = 2;
        String table2 = "";
        for (int j = 1; j < 11; j++) {
            table2 += n + "X" + j + "=" + n * j;
            table2 += "\n";
        }
            try {
                FileWriter fileWriter = new FileWriter("multlipication2.txt");
                fileWriter.write(table2);
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        int m=3;
        String table3= "";
        for(int j=1;j<11;j++) {
            table3 += m + "X" + j + "=" + m * j;
            table3 += "\n";
        }
        try {
            FileWriter fileWriter=new FileWriter("multiplication3.txt");
            fileWriter.write(table3);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int k=4;
        String table4= "";
        for(int j=1;j<11;j++) {
            table4 += k + "X" + j + "=" + k * j;
            table4 += "\n";
        }
        try {
            FileWriter fileWriter=new FileWriter("multiplication4.txt");
            fileWriter.write(table4);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int l=5;
        String table5= "";
        for(int j=1;j<11;j++) {
            table5 += l + "X" + j + "=" + l * j;
            table5 += "\n";
        }
        try {
            FileWriter fileWriter=new FileWriter("multiplication5.txt");
            fileWriter.write(table5);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int o=6;
        String table6= "";
        for(int j=1;j<11;j++) {
            table6 += o + "X" + j + "=" + o*j;
            table6 += "\n";
        }
        try {
            FileWriter fileWriter=new FileWriter("multiplication6.txt");
            fileWriter.write(table6);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int p=7;
        String table7= "";
        for(int j=1;j<11;j++) {
            table7 += p + "X" + j + "=" + p * j;
            table7 += "\n";
        }
        try {
            FileWriter fileWriter=new FileWriter("multiplication7.txt");
            fileWriter.write(table7);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int q=8;
        String table8= "";
        for(int j=1;j<11;j++) {
            table8 += q + "X" + j + "=" + q * j;
            table8 += "\n";
        }
        try {
            FileWriter fileWriter=new FileWriter("multiplication8.txt");
            fileWriter.write(table8);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int a=1;
        String table= "";
        for(int j=1;j<11;j++) {
            table += a + "X" + j + "=" + a * j;
            table += "\n";
        }
        try {
            FileWriter fileWriter=new FileWriter("multiplication1.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }
