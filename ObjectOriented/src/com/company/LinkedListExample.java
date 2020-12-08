package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<String> tools=new LinkedList<String>();
        tools.add("JAVA");
        tools.add("SPRING");
        tools.add("AZURE");
        tools.add("MONGODB");
        tools.add("WIN");


        tools.addFirst("API");

        System.out.println(tools);

        System.out.println(tools.get(4));

        Collections.sort(tools);
        System.out.println(tools);



    }

}
