package com.company;

interface FunctionalInterface{
    void meth1();
    void meth2();
}
class classy{
    @Deprecated
    public void metu(){
        System.out.println("I am depricated");
    }
}
public class CWHannotation {
    @SuppressWarnings("Deprecations")
    public static void main(String[] args) {
        classy c= new classy();
        c.metu();
        FunctionalInterface ft= new FunctionalInterface() {
            @Override
            public void meth1() {
                System.out.println("i am annomys class's meth1");
            }

            @Override
            public void meth2() {
                System.out.println("i am annomys class's meth2");
            }
        };
        ft.meth1();
        ft.meth2();
    }
}
