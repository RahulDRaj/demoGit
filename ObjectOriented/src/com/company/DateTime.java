package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {

        LocalDateTime localDate=LocalDateTime.now();
        System.out.println("Before format "+ localDate);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate=localDate.format(formatter);
        System.out.println("After format: "+formattedDate);

    }

}
