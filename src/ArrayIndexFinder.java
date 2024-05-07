public class ArrayIndexFinder {

    //Method to return the index number of a value in an array
    public static <T> int findIndex(T[] arr, T value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                return i;
            }
        }
        // If value is not found, return -1
        return -1;
    }
}