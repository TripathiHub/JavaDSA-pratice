package com.himanshu;
import java.lang.classfile.instruction.SwitchCase;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;
interface bookdetails{
    public void addbookwithdetails(String bookname,String authorname);
}
class Library implements bookdetails
{
    String authorname;
    String[] books;
    int no_of_books;
    @Override
    public String toString() {
        return "Library{" +
                "authorname='" + authorname + '\'' +
                ", books=" + Arrays.toString(books) +
                ", no_of_books=" + no_of_books +
                '}';
    }
    public Library()
    {
        this.books = new String[100];
         this.no_of_books=0;
        this.books[0] ="Think and Grow Rich";
        no_of_books++;
        this.books[1] ="Pride of India";
        no_of_books++;
        this.books[2] ="Java";
        no_of_books++;
        this.books[3] ="C++";
        no_of_books++;
        this.books[4] ="DSA";
        no_of_books++;
        this.books[5] ="Python";
        no_of_books++;
        this.books[6] ="Maths-1";
        no_of_books++;
    }
    public void showavailablebook() {
        System.out.println("the books available in library are: ");
        for (int i=0;i<this.no_of_books;i++) {
            System.out.println( i+".*. " + books[i]);
        }
            if (this.no_of_books == 0) {
                System.out.println("no currently books available");
            }
    }
    public void issueBook(String book)
    {
        for (int i = 0; i < this.books.length; i++)
        {
                if (this.books[i].equalsIgnoreCase(book))
                {
                    System.out.print(book+" book has been issued on : ");
                    LocalDateTime lt=LocalDateTime.now();
                    System.out.println(lt);
                    System.out.println("KINDLY NOTE THE INDEX OF BOOK WHICH YOU ARE ISSUING");
                    System.out.println("BEACUSE WHEN YOU WILL RETURN IT IS COMPULSORY TO ENTER INDEX OF BOOK");
                    this.books[i] = book +" --> this book has been already issued ";
                    return;
                }
            }
            System.out.println("the book doesnot exist");
        }
        public void returnbook (String book,int index )
        {
            LocalDateTime lt = LocalDateTime.now();
            System.out.println("the book "+book+" has been returned on: " +lt);
            this.books[index]= book;
        }
        public void addBook (String book) {
            this.books[no_of_books] = book;
            no_of_books++;
            System.out.println(book + " thas been added");
        }
    @Override
    public void addbookwithdetails(String bookname ,String authorname) {
        this.books[no_of_books] = bookname;
        no_of_books++;
        this.authorname = authorname;
    }
    }
public class CWH {
    public static void main(String[] args)
    {
    Library student1= new Library();
    Boolean flag=true;
        System.out.println("WELCOME TO TRIPATHI LIBRARY");
        System.out.println("RULES AND REGULATION OF TRIPATHI LIBRARY : ");
        System.out.println("* You can add 1,2 or 3 book only at a time ");
        System.out.println("* You can issue or return those books which are already in library.");
        System.out.println("* You can issue or return only one book at a time");
        System.out.println("* READ CAREFULLY all rules of library also ");
        System.out.println("NOTE : READ ALL COMMENTS PROPERLY TO RUN ONLINE LIBRARY");
        System.out.println("Enter your choice from the below for any work in TRIPATHI LIBRARY");
        System.out.println("1.Add only ONE book to Library");
        System.out.println("2.Add TWO books to Library");
        System.out.println("3.Add THREE books to Library");
        System.out.println("4.To ISSUE from Library");
        System.out.println("5.To RETURN book from Library");
        System.out.println("6.To get list of all books in Library");
        System.out.println("7.EXIT");
    while(flag) {
        System.out.println("Now Enter your choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Your choice is to add 1 book");
                System.out.println("Enter name of book which you want to ADD");
                String book = sc.nextLine();
                student1.addBook(book);
                break;
            case 2:
                System.out.println("Your choice is to add 2 book");
                System.out.println("Enter name of books which you want to ADD");
                String book1 = sc.nextLine();
                String book2 = sc.nextLine();
                student1.addBook(book1);
                student1.addBook(book2);
                break;
            case 3:
                System.out.println("Your choice is to add 3 books");
                System.out.println("Enter names of books which you want to ADD");
                String book3 = sc.nextLine();
                String book4 = sc.nextLine();
                String book5 = sc.nextLine();
                student1.addBook(book3);
                student1.addBook(book4);
                student1.addBook(book5);
                break;
            case 4:
                System.out.println("Enter name book which you want to issue");
                String book6 = sc.nextLine();
                student1.issueBook(book6);
                break;
            case 5:
                System.out.println("Enter name of book which you want to return");
                String book7 = sc.nextLine();
                System.out.println("Enter index of book which you have issued and want to return now -->> NOTE INDEX IS COMPULSORY");
                int index = sc.nextInt();
                student1.returnbook(book7, index);
                break;
            case 6:
                System.out.println("You want to see all available books");
                student1.showavailablebook();
                break;
            case 7:
                System.out.println("While Exiting please gave us rating on the scale of 5 ");
                int rate = sc.nextInt();
                if (rate == 5 || rate == 4) {
                    System.out.println("We team TRIPATHI are very happy by this rating");
                } else if (rate == 3 || rate == 2) {
                    System.out.println("We team TRIPATHI will IMPROVE ");
                } else if (rate == 1 || rate == 0) {
                    System.out.println("We team TRIPATHI is sorry about your EXPRIENCE");
                } else if (rate > 5) {
                    System.out.println("Invalid Rating");
                }
                System.out.println("THANK YOU -->> TRIPATHI LIBRARY");
                flag = false;
                break;
            default:
                System.out.println("INVALID ENTRY READ RULES AND REGULATIONS PROPERLY");
        }
    }
    }
}
