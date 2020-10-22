package com.softserve.edu;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //
        // /*-
        Gson gson = new Gson();
        Student student = new Student("ComputerScience", 1, "Ivanov", "12345");
        System.out.println("Origin Student = " + student);
        String ser = gson.toJson(student);
        System.out.println("ser = " + ser);
        ser = ser.substring(0, ser.length()-1)+ ",\"password\":\""+"qwerty54321"+"\"}";
        System.out.println("ser = " + ser);
        //
        Student unknown = (Student) gson.fromJson(ser, Student.class);
        System.out.println("After Serialization unknown = " + unknown);
        // */
    }
}
