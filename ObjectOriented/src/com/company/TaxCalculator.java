package com.company;

public class TaxCalculator
{
    private float income;
    private float insurance;


    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public float getInsurance() {
        return insurance;
    }

    public void setInsurance(float insurance) {
        this.insurance = insurance;
    }

    public TaxCalculator(float income,float insurance) {
        setIncome(income);
        setInsurance(insurance);
    }

    public TaxCalculator(float income) {

        this.insurance=0;
        new TaxCalculator(income,this.insurance);
    }


    public float calculateTax()
    {
        if(getIncome() < 500000)
            return 0;
        else
            return (float)(.18* (getIncome() - getInsurance()));
    }



}
