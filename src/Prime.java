import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        List<Integer> primeArray = new ArrayList();
        int size = 0, number =2;
        while(size < arraySize){
            int count = 0;
            for (int j = 1; j <= number; j++) {
                if (number % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeArray.add(number);
                size++;
            }
            number++;
        }

        String separator = "";  // separator here is your ","
        for(Integer num : primeArray){
            System.out.print(separator+num);
            separator = ", ";
        }
    }
}
