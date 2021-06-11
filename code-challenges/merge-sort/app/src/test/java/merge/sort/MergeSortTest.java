package merge.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class MergeSortTest {
  @Test
  public void testMerge(){
    int[] left = new int[]{3};
    int[] right = new int[]{1};
    int[] arr = new int[]{3,1};
    for(int i: App.mergeSort(new int[]{4}, new int[]{1}, new int[]{2,3,4,1})){
      System.out.println(i);
    }
    assertTrue(Arrays.equals(new int[]{1,3}, App.mergeSort(left,right,arr)));
    left = new int[]{2};
    right = new int[]{4};
    arr = new int[]{2,4};
    assertTrue(Arrays.equals(new int[]{2,4}, App.mergeSort(left,right,arr)));
    assertNull(App.mergeSort(null, right, arr));
  }
  @Test
  public void testMergeSort(){
    int[] arr = new int[]{4,1,9,3};
    int[] sortedArr = new int[]{1,3,4,9};

    assertTrue(Arrays.equals(App.mergeSort(arr), sortedArr));

    arr = new int[]{1,2,3,4};
    assertTrue(Arrays.equals(arr, App.mergeSort(arr)));

    assertNull(App.mergeSort(null));
  }
}
