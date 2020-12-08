package com.company;

import java.util.Scanner;

public class MyCart
{
    public int price[] = new int[2];
    public int number[] = new int[2];

    public int calcPrice()
    {
        int total=0;
        System.out.println("Total price : ");
        for(int i=0;i<2;i++)
        {
            total+=(price[i] * number[i]);
        }
        return  total;
    }

    public void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter price of 2 items");
        for(int i=0;i<2;i++)
        {
           price[i]=sc.nextInt();
        }
        System.out.println("Enter quantity of 2 items");
        for(int i=0;i<2;i++)
        {
            number[i]=sc.nextInt();
        }

    }


}
