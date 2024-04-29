import java.util.*;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        Integer[] list = new Integer[arraySize];
        for (int i=0; i < arraySize; i++){
            int number = scanner.nextInt();
            list[i] = number;
        }
        Arrays.sort(list, Collections.reverseOrder());
        System.out.println(list[1]);
    }
}
