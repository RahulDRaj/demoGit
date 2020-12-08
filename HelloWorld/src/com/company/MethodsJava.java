package com.company;

public class MethodsJava {
    public static void main(String[] args) {
//        greetUser("Kannan");
//        helloUser("Kannan", 27);

        //recursion
        //System.out.println(rec(5));



    }


    public static void greetUser(String name) {
        System.out.println("Hello " + name);
    }

    public static void helloUser(String name, int age) {
        System.out.println(name + " is " + age);


    }

    public static int rec(int k)
    {
        if(k>0)
            return k + rec(k-1);
        else
            return 0;
    }

}
