package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    static boolean isOdd( int number){ // created a odd method to call  to use for Q1, Q2
        return (number % 2) != 0 ;}
    public static String getEvenNumbers(int start, int stop) {

        StringBuilder sb = new StringBuilder();
        for (int i = start; i< stop; i++) {
            if (isOdd(i)) {
                sb.append(i);
                System.out.println(i + " was append to the string");
                System.out.println(isOdd(i));
            }// the name of the method is misleading.
            else {
                System.out.println(i + " was not add");

            }
        }
        return sb.toString();// append turns to a String for us.







       // return null;
    }


    public static String getOddNumbers(int start, int stop) {


        StringBuilder sb = new StringBuilder();
        for (int i = start; i< stop; i++) {
            if (!isOdd(i)) {
                sb.append(i);
                System.out.println(i + " was append to the string");
                System.out.println(isOdd(i));
            }// the name of the method is misleading.
            else {
                System.out.println(i + " was not add");

            }
        }
        return sb.toString();// append turns to a String for us.



       // return null;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
