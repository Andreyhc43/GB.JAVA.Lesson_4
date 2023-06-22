package com.example;

import com.example.exeption.MyArrayDataException;
import com.example.exeption.MyArraySizeException;

public class MyMethod {

    public MyMethod() {

    }

    public void processingArray(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        Integer temp;
        int result = 0;

        if (arr[0].length == 4 & arr[1].length == 4) {
            for (int i = 0; i < arr[0].length; i++) {
                for (int j = 0; j < arr[1].length; j++) {
                    try {
                        temp = Integer.parseInt(arr[i][j]);
                        result = result + temp;
                    } catch (NumberFormatException e) {
                        // e.getMessage();
                        throw new MyArrayDataException(i, j);
                    }
                    finally{
                        System.out.println("Сумма значений в массиве:" + result);

                    }
                    

                }
            }
        } else {
            throw new MyArraySizeException(arr[0].length, arr[1].length);
        }
    }

}
