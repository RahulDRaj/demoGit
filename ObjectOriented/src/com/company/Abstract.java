package com.company;

abstract class Abstract
{
    public String fname= "Kannu";
    public abstract void profession();

}

class Student extends Abstract
{
    public int passedYear = 2019;
    public void profession()
    {
        System.out.println("Engineer");
    }
}
