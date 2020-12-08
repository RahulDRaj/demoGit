package com.cart;

import java.util.ArrayList;

public class CreateFilter
{
    public void showResults(ArrayList<Cart> list, int choice)
    {

        FilterInterface filter= new FilterClass();
        filter.showFilteredResults(list,choice);
        System.out.println("------------------------------------");

    }
}
