package com.company;

import java.util.ArrayList;

class Book{
     public String name,authorname;
     public Book(String name,String authorname){
         this.name=name;
         this.authorname= authorname;
     }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authorname='" + authorname + '\'' +
                '}';
    }
}
class Library{
    public ArrayList<Book> books;
    public Library(ArrayList<Book> books){
        this.books= books;
    }
    public void addBook(Book book){
        System.out.println("the book has been added " + book);
        this.books.add(book);
    }
    public void returnBook(Book b){
        System.out.println("the has been returned " + b);
        this.books.add(b);
    }
    public void issueBook(Book book,String issue_to){
        System.out.println("the book has been issued"+ issue_to);
        this.books.remove(book);
    }

}
public class CWHfinalexersice {
    public static void main(String[] args) {
        ArrayList<Book> bk= new ArrayList<>();
        Library l1=new Library(bk);
      Book b1 =  new Book("dsa","himanshu");
      bk.add(b1);
        bk.add(new Book("dsa1","himanshu1"));
        bk.add(new Book("dsa2","himanshu2"));
        l1.addBook(new Book("algo4","hrt"));
        System.out.println(l1.books);
        l1.issueBook(b1,"ht");
        l1.returnBook(b1);

    }
}
