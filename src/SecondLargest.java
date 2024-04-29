import java.util.*;

public class SecondLargest {

    public static void main(String args[] ) throws Exception {
        /* Enter your code here. */
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        Integer[] ascendingArray = new Integer[arraySize];
        for(int i=0; i<arraySize; i++){
            ascendingArray[i] = scanner.nextInt();
        }

        Arrays.sort(ascendingArray, Collections.reverseOrder());
        System.out.println("Second largest: "+ ascendingArray[1]);


    }
}
