package SearchAndSortAlgorithm;

public class InsertionSort {

    public static void insertSort(int[] arr){

        for( int i =1 ;i<arr.length;i++){ //6,9,8,7
            int v = arr[i]; //8
            int  j= i; //2

            while(j>=1 && arr[j-1]>v){
                arr[j]=arr[j-1];
                j--;
            }

            arr[j]=v; //6, 8,
        }
    }

    public static void main(String[] args) {
        int arr[] = {7,1,0,9,5,13};
        insertSort(arr);
        System.out.println("Sorted array");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
