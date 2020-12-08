package com.company;

import java.text.NumberFormat;

public class MathData
{
    public static void main(String[] args) {
        /*int result=Math.round(1.3f);*/

        //int result=(int) Math.floor(1.3f);
       // int result=Math.max(1,7);
        //int result=(int)Math.round(Math.random()*100);
//        NumberFormat currecny=NumberFormat.getCurrencyInstance();
//        String result=currecny.format(12345.5);
//

        String result=NumberFormat.getPercentInstance().format(0.12);
        System.out.println(result);
    }
}
