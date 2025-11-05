package com.company;
class Employee{
    int id;
    String name;
    int salary;
    public Employee(){
        id=45;
        name= "nagesh";
        salary = 100;
    }
    public Employee(int n,String s,int sal)
    {
        id=n;
        name=s;
        salary=sal;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

}


public class CWHpraticeset9q1
{
    public static void main(String[] args)
    {
        Employee em1= new Employee();
        System.out.println(em1.getId());
        System.out.println(em1.getName());
        System.out.println(em1.getSalary());
    }

}
