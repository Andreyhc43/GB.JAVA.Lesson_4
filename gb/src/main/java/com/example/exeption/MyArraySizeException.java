package com.example.exeption;

public class MyArraySizeException extends MyException{
    
    public MyArraySizeException(int row, int column){
        this.numberColumn = column;
        this.numberRow = row;
    }

    @Override
    public void printComment(){
        System.out.println("массив больше положенного..., а именно:"+ this.numberColumn +" "+ this.numberRow);
    }
}
