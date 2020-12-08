package com.company;

public class NewCart
{
    private int price;
    private int quantity;

    private void setPrice(int price) {
        this.price = price;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int getPrice() {
        return price;
    }

    private int getQuantity() {
        return quantity;
    }

    public NewCart(int price, int quantity)
    {
        if(price<1 || quantity<1)
            throw new IllegalArgumentException("Arguments cannot be 0");
        setPrice(price);
        setQuantity(quantity );
    }


    public int calculatePrice()
    {
        int total=quantity*price;

        return calculateDiscount(total);
    }

    private int calculateDiscount(int total)
    {
        if(total>1500)
            return (int)(total - total*.1);
        else
            return total;
    }





}
