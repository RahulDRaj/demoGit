package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListExample
{
    public static void main(String[] args)

    {
        //For integer Arraylist<Integer> tools= new ArrayList<Integer>();
        ArrayList<String> tools=new ArrayList<String>();
        tools.add("Kannu");
        tools.add("Plinku");
        tools.add("Mottu");
        tools.add("blublu");

       // tools.set(3,"SA");    //Replace
        //System.out.println(tools.get(1)); //get with index

        tools.remove(3);

        Collections.sort(tools);

       // System.out.println(tools.size());
       // System.out.println(tools);
//        for(int i = 0; i < tools.size(); i++)
//        {
//            System.out.println(tools.get(i));
//
//        }

        Iterator<String> itr = tools.iterator();

        while (itr.hasNext())
        System.out.println(itr.next());


//        for(String a:tools)
//        {
//            System.out.println(a);
//        }




    }




}
