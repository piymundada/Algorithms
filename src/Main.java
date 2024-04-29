import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Math.PI
        //double pi = 3.14f;
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        array[0] = Integer.MIN_VALUE;
        for(int i = 0; i < arraySize; i++){ // 14 15 17 2 5 4 18
            int value = scanner.nextInt();

            for (int j=0; j<= i; j++){
                int max = Integer.max(array[j], value); //15
                int min = Integer.min(array[j], value); //14
                array[j] = min; // 14
                array[i] = max; //15
            }
        }
        System.out.println(array);
        System.out.println(array[1]);


    }
}



