package com.softserve.studing_for_myself;

public class MyException extends Exception{

    private  static  final long serialVersionUID = 1L;

    public MyException(String msg){
        super(msg);
    }

    public MyException() {
    }
}
