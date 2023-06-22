package com.example.exeption;

public class MyArrayDataException extends MyException{
    
    


    public MyArrayDataException(int row, int column){
        this.numberColumn = column;
        this.numberRow = row;
    }

    

    @Override
    public void printComment(){
        System.out.println("Значение не удалось преобразовать.");
    }

}
