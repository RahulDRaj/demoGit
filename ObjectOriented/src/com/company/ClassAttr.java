package com.company;

public class ClassAttr
{
    int x;
    int year;
    String modelName;

    public ClassAttr(int y)
    {   
        x=y;
    }

    public ClassAttr(int year,String modelName)
    {
        this.modelName=modelName;
        this.year=year;
    }

    public static void main(String[] args)
    {
        ClassAttr classAttr = new ClassAttr(1993,"DELL");
        System.out.println(classAttr.year+" "+classAttr.modelName);
    }
}
