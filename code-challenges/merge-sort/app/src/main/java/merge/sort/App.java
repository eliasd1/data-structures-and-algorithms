/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package merge.sort;

import java.util.Arrays;

public class App {
  public static void main(String[] args) {
    for(int i : mergeSort(new int[]{4,5,2,3,7,8})){
      System.out.println(i);
    }
  }
  public static int[] mergeSort(int [] arr){
    int n = arr.length;
    int[] left = new int[]{};
    int[] right = new int[]{};
    if(n > 1){
      int mid = n/2;
      left = Arrays.copyOf(arr, mid);
      right = Arrays.copyOfRange(arr, mid, n);
      mergeSort(left);
      mergeSort(right);
    }
    return mergeSort(left, right, arr);
  }
  public static int[] mergeSort(int[] left, int[] right, int[] arr){
    int i = 0;
    int j = 0;
    int k = 0;

    while(i<left.length && j<right.length){
      if(left[i] <= right[j]){
        arr[k] = left[i];
        i += 1;
      } else{
        arr[k] = right[j];
        j += 1;
      }
      k += 1;
    }
    if(i == left.length){
      while(j < right.length){
        arr[k] = right[j];
        k+=1;
        j+=1;
      }
    } else{
      while(i < left.length){
        arr[k] = left[i];
        k+=1;
        i+=1;
      }
    }
    return arr;
  }
}
