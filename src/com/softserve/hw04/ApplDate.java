package com.softserve.hw04;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ApplDate {
    public static void main(String[] args) throws ParseException {
        // JDK 1.8
        // LocalDate myObj = LocalDate.now(); // Create a date object
        // System.out.println(myObj); // Display the current date
        //
        // JDK 1.0
        // Date birthDay = new GregorianCalendar(1990, Calendar.DECEMBER, 15).getTime();
        // Date birthDay = new Date(System.currentTimeMillis()); // Milliseconds from
        // 01.01.1970 00:00:00.0
        Date birthDay = new SimpleDateFormat("dd/MM/yyyy").parse("31/02/1994");
        System.out.println(birthDay);
        //
        long birthDayTime = birthDay.getTime();
        long currentTime = System.currentTimeMillis();
        Date age = new Date(currentTime - birthDayTime);
        //System.out.println(age);
        //
        DateFormat dateFormat = new SimpleDateFormat("yyyy");  
        String strDate = dateFormat.format(age);
        int result = Integer.valueOf(strDate) - 1970;
        System.out.println(result);
        //
        Date dd = new Date();
        System.out.println("dd = " + dd);
    }
}