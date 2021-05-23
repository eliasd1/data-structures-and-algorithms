/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quick_sort;

import java.util.Arrays;

public class App {
     public static void main(String[] args) {
       int[] arr = new int[]{8,4,23,42,16,15,2};
       System.out.println(Arrays.toString(quickSort(arr, 0, arr.length-1)));
    }
    public static int[] quickSort(int[] arr, int left, int right){
       if(left<right){
         int position = partition(arr, left, right);
         quickSort(arr, left, position-1);
         quickSort(arr, position+1, right);
       }
       return arr;
    }
    public static int partition(int[] arr, int left, int right){
       int pivot = arr[right];
       int low = left-1;

       for(int i = left; i<right; i++){
         if(arr[i] <= pivot){
           low++;
           Swap(arr, i , low);
         }
       }

       Swap(arr, right, low+1);
       return low+1;
    }
    public static void Swap(int arr[], int i , int low){
       int temp = arr[i];
       arr[i] = arr[low];
       arr[low] = temp;
  }
}
