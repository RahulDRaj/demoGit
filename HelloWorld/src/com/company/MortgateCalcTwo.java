package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgateCalcTwo
{
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int  principle = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Principal Amount: ");
            principle = sc.nextInt();
            if(principle >= 1000 && principle <=1000000 )
                break;
            System.out.println("Enter a value between 1000 and  1000000");
        }

        while(true)
        {
            System.out.println("Annual Interest Rate: ");
            float annualInterest = sc.nextFloat();
            if(annualInterest >=1 && annualInterest <=30)
            {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter value between 1 and 30");
        }


        while(true)
        {
            System.out.println("Period (Years): ");
            byte years = sc.nextByte();
            if(years >=1 && years <=30)
            {
                numberOfPayments = years*MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Repayment  years should be between 1 and 30 ");

        }


        double mortgage = principle * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+mortgageFormatted);

    }
}
