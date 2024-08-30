package SearchAndSortAlgorithm;

public class BinarySearch {

    /**
     * Expectation : Array should be sorted
     *
     * if the num is found then print the index
     *
     * else print that the number is not found
     * @param arr
     * @param left
     * @param right
     * @param num
     *
     * TC : O(logn)
     *
     */
    public static void search(int[] arr, int left, int right, int num){

        //Base condition
        if(left > right){
            System.out.println("Number : "+ num +" can't be found in the array");
            return ;
        }

        int mid = left + (right - left)/2 ; // (left+right)/2
        System.out.println(arr[mid]);
        if(arr[mid] == num){
            System.out.println(num + " is found at the index "+ mid);
        }
        else if ( arr[mid] > num){
            search(arr, left, mid-1, num);
        }else{
            search(arr, mid+1, right, num);
        }
    }


    public static void main(String[] args) {
        int[] arr = {3,5,7,8,10,12,13,15,19};

        search(arr, 0, arr.length-1 , 1);
    }
}

