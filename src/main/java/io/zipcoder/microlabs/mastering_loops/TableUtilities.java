package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable( 10);
    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder sb =new StringBuilder();
        //need a loop in side a loop. for loop.
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                if (9 >= (i * j)) {
                    sb.append("  " + (i * j) + " |");
                } else if ((i * j) < 100) {
                    sb.append(" " + (i * j) + " |");
                } else {
                    sb.append((i * j) + " |");
                }
            }
//                // need them to be multiplied by each other numbers in row and column.
            // i need a sb.
            sb.append("\n");
        }
        return sb.toString();
    }
}




//return null;


