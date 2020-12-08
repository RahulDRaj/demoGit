package com.interfaces;

public class MainTaxClass {
    public static void main(String[] args) {
        var calulator = new TaxCalculator2020(50);
        var report = new TaxReport();
        report.show(calulator);
        report.show(new TaxCalculator2021());
    }
}
