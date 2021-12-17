package exceptions.customException;

import exceptions.customException.CustomException;

public class ExceptionsExample {
    public static void main(String[] args) {

        // Will not throw an exception
        int x = 50;
        int y = 35;

        checkMyNumber(x);
        checkMyNumber(y);

        // Will throw an exception
        int z = 65;
        int f = 5;

        checkMyNumber(z);
        checkMyNumber(f);








    }


    public static void checkMyNumber (int number) {
        try {
            detectNumbersOverFiftyAndBelowTen(number);
            System.out.println("Your number was " + number + " and it does not throw an exception.");

        } catch (CustomException e) {

            e.printStackTrace();
        }
    }



    public static void detectNumbersOverFiftyAndBelowTen(int number) throws CustomException {
        if (number > 50) {
            throw new CustomException("Your number is over 50!");
        } else if (number < 10) {
            throw new CustomException("Your number is below 10!");
        }
    }


}
