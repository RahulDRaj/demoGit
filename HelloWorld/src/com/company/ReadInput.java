package com.company;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter Age:");
//        byte age=sc.nextByte();

        System.out.print("Name: ");
//        String age=sc.next();
        String age=sc.next().trim();
        System.out.println("Age is "+age);
    }
}
