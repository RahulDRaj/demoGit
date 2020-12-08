package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class TaxConsole
{
    static Scanner sc= new Scanner(System.in);
    public static float readFloat(String message)
    {
        System.out.println(message);
        return sc.nextFloat();
    }
    public static void  printTax(float tax)
    {

        System.out.println("Payable amount is " + NumberFormat.getCurrencyInstance().format(tax));
    }
}
