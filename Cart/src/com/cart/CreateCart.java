package com.cart;

import java.util.ArrayList;

//decoupled class
public class CreateCart
{

    public ArrayList<Cart> createNewCart()
    {
        ListInterface list= new CreateCartList();
        return list.createList();
    }
}
