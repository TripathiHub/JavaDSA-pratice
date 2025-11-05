package com.company;

import java.io.*;
import java.util.Scanner;

public class CWHfilehandling {
    public static void main(String[] args) {
        File file=new File("mutlipication9.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int a=50;
        try {
            FileWriter fileWriter = new FileWriter("multiplication1.txt");
            FileWriter fileWriter1= new FileWriter("multlipication9.txt");
            fileWriter1.write("this is file writing im 9 "+a);
            fileWriter.write("this is a file writing\n byy "+a);
            fileWriter.close();
            fileWriter1.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fileReader=new FileReader("multiplication1.txt");
            Scanner sc =new Scanner(fileReader);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        File file1=new File("mutlipication9.txt");
        if(file1.delete()){
            System.out.println( file1+" file is deleted");
        }
        else{
            System.out.println("file not found");
        }
    }
}
