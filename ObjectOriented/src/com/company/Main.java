package com.company;

public class Main {

    public static void main(String[] args)
    {
//	// write your code here
//        var textBox1 = new TextBox();
//        textBox1.setText("Hai");
//        System.out.println(textBox1.text);

//        var emp1= new Employee();
//        emp1.baseSalary=20000;
//        emp1.hourlyRate=20;
//
//        System.out.println(emp1.calculateWage(15));

        var cart=new NewCart(0,300);
        System.out.println("Total payable amount is "+cart.calculatePrice());


    }
}
