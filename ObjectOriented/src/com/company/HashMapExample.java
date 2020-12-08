package com.company;

import java.util.HashMap;

public class HashMapExample
{
    public static void main(String[] args)
    {
        //HashMap : key / value
        HashMap<String, String> techList = new HashMap<String, String>();
        techList.put("Tech1","AI1");
        techList.put("Tech2","AI2");
        techList.put("Tech3","AI3");
        techList.put("Tech4","AI4");
        techList.put("Tech5","AI5");

        System.out.println(techList.get("Tech1"));

        System.out.println(techList.keySet());

        for(String tech: techList.keySet())
        {
            System.out.println(tech +" "+ techList.get(tech));
        }


    }
}
