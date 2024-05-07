/*
Phillip Yohner
COP 3330C - CRN 24680
March 14, 2024

*** PART 1 ***

Description:
The purpose of this program - Things App - demonstrates the ability to return the position (index) of a value
in an array of values through the uses of a custom method.  This is demonstrated with three arrays
of different data types - Integers, Strings, and Doubles.  The output shows the search value for each array
and the position of the value in the array.
*/

public class ThingsApp {

    public static void main(String[] args) {

        //Create array of integers
        Integer[] integerArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Integer integerToFind = 10; //Integer to find in array
        int index = ArrayIndexFinder.findIndex(integerArray, integerToFind); //Get index of searched integer
        //IF statement to provide index number or a statement that the integer is not in the array.
        if (index != -1) {
            System.out.println("Index of " + integerToFind + ": " + index);
        } else {
            System.out.println(integerToFind + " not found in the array.");
        }

        //Create array of names
        String[] stringArray = {"Billy", "Gregg", "Phillip"};
        String stringToFind = "Phillip"; //String to find in array
        index = ArrayIndexFinder.findIndex(stringArray, stringToFind); //Get index of searched string
        //IF statement to provide index number or a statement that the string is not in the array.
        if (index != -1) {
            System.out.println("Index of " + stringToFind + ": " + index);
        } else {
            System.out.println(stringToFind + " not found in the array.");
        }

        //Create array of doubles
        Double[] doubleArray = {2.2, 4.4, 6.6, 8.8};
        Double doubleToFind = 8.8; //Double to find in array
        index = ArrayIndexFinder.findIndex(doubleArray, doubleToFind); //Get index of searched double
        //IF statement to provide index number or a statement that the double is not in the array.
        if (index != -1) {
            System.out.println("Index of " + doubleToFind + ": " + index);
        } else {
            System.out.println(doubleToFind + " not found in the array.");
        }

    }
}