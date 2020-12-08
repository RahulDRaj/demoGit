package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgateCalcRefactor

{
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {



        int  principle = (int)readNumber("Principal Amount: ", 1000, 1000000);
        float annualInterest = (float)readNumber("Annual Interest Rate: ", 1, 30 );
        byte years = (byte)readNumber("Period (Years): ", 1, 30);

        printMortgate(principle, annualInterest , years);
        printPaymentSchedule(principle, annualInterest, years);


    }

    public static void printMortgate(int principle, float annualInterest,
                                      byte years)
    {
        double mortgate = calculateMortgate(principle, annualInterest ,years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgate);
        System.out.println("Monthly Payments: "+mortgageFormatted);


    }

    public static  double calculateMortgate(int principle, float annualInterest,
                                            byte years)
    {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years*MONTHS_IN_YEAR;

        double mortgage = principle * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }



    public static void printPaymentSchedule(int principle, float annualInterest,
                                            byte years)
    {
        System.out.println();
        System.out.println("Payment Schedule");
        System.out.println("**********************");
        for(short month=1; month <= years * MONTHS_IN_YEAR ; month++)
        {
            double balance = calculateBalance(principle,annualInterest,years,month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));

        }


    }
    public static double readNumber(String prompt,
                                    double min,
                                    double max)
    {
        Scanner sc = new Scanner(System.in);
        double value;

        while(true)
        {
            System.out.println(prompt);
            value=sc.nextFloat();
            if(value >= min && value <= max)
            {
                break;
            }
            System.out.println("Value should be between " + min +
                    " and "+ max );

        }

        return value;
    }
    public static double calculateBalance(
                        int principle,
                        float annualInterest,
                        byte years,
                        short numberOfPaymentsMade)
    {

        float monthlyInterest = annualInterest * MONTHS_IN_YEAR
                / PERCENT;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double balance = principle
                            *(Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                            / (Math.pow(1 + monthlyInterest, numberOfPayments)-1);


        return balance;
    }



}
