 class GenericMinFinder {

    /*
    You are tasked with implementing a generic method that finds and returns the minimum element from an array of comparable elements. Implement the GenericMinFinder class with the following method:

public static <T extends Comparable<T>> T findMin(T[] array): This method should take an array of comparable elements and return the minimum element in the array.
Create an array of integers and an array of strings, and use the findMin method to find the minimum element in each array.
     */
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"A", "B", "C", "D"};

        System.out.println("Minimum integer: " + GenericMinFinder.findMin(intArray));
        System.out.println("Minimum string: " + GenericMinFinder.findMin(stringArray));


    }
    public static <T extends Comparable<T>> T findMin(T[] array) {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }
}





