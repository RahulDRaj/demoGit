package com.company;

import java.util.HashSet;

public class HashSetExample
{
    public static void main(String[] args)
    {   //Hashset unique values
        HashSet<String> tools = new HashSet<String>();
        tools.add("JAVA");
        tools.add("SPRING");
        tools.add("AZURE");
        tools.add("MONGODB");
        tools.add("WIN");
        tools.add("JAVA");

        System.out.println(tools);

    }
}
