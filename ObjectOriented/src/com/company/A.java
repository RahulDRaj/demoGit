package com.company;

class A{
    void run(){System.out.println("A is running");}
}
class B extends A
{
    void run(){System.out.println("B is running");}

    public static void main(String args[]){
        A a = new B();
        a.run();
    }
}