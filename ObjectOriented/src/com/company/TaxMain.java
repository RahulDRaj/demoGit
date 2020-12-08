package com.company;

public class TaxMain
{
    public static void main(String[] args)
    {
        float income=TaxConsole.readFloat("Enter Income: ");
        float insurance=TaxConsole.readFloat("Enter Insurance: ");
        TaxCalculator taxCalculator=new TaxCalculator(income,insurance);
        TaxConsole.printTax(taxCalculator.calculateTax());


    }
}
