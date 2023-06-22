package com.example;

import java.util.Random;

import com.example.exeption.MyArrayDataException;
import com.example.exeption.MyArraySizeException;
import com.example.exeption.MyException;

public final class App {

    public static void main(String[] args) {
        Random random = new Random();

        String[][] myArrayCorrect = new String[4][4];
        // String[][] myArrayUncorrect = new String[3][4];

        String s = "";

        for (int i = 0; i < myArrayCorrect[0].length; i++) {
            for (int j = 0; j < myArrayCorrect[1].length; j++) {

                switch (random.nextInt(1)) {
                    case 0:
                        myArrayCorrect[i][j] = Integer.toString(random.nextInt(9));
                        s = s.concat(myArrayCorrect[i][j]);

                    case 1:
                        myArrayCorrect[i][j] = "_";
                        s = s.concat(myArrayCorrect[i][j]);
                }
            }
        }

        System.out.println(s);

        MyMethod myMethod = new MyMethod();

        try {
            myMethod.processingArray(myArrayCorrect);
        } catch (MyArrayDataException e) {
            e.printComment();
            
        } catch (MyArraySizeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
