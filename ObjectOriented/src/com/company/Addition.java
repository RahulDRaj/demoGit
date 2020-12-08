package com.company;

public class Addition {
    static String sum(int a,int b)
    {
        int calc=a+b;
        return "Sum calc by method 1 is "+ calc;
    }
    static String sum(int a,int b,int c)
    {
        int calc=a+b+c;
        return "Sum calc by method 2 is "+ calc;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,4));

    }
}
