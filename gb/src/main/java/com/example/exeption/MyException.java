package com.example.exeption;

public abstract class MyException extends Exception {
    

    int numberRow, numberColumn;


    public MyException(){}

    public int getNumberColumn(){
        return numberColumn;
    }
    public int getNumberRow(){
        return numberRow;
    }

    public void printComment(){}

    
}
