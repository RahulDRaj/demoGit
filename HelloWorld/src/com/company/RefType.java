package com.company;

import java.awt.*;
import java.util.Date;

public class RefType {
    public static void main(String[] args) {

        Point point1=new Point(1,2);
        Point point2=point1;

        System.out.println(point2.getLocation());

    }

}
