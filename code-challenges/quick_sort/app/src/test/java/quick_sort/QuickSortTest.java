package quick_sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QuickSortTest {
  @Test
  public void testSwap(){
    int[] arr = new int[]{1,2,3,4};
    App.Swap(arr, 0,3);

    assertEquals(4, arr[0]);
    assertEquals(1, arr[3]);

    App.Swap(arr, 1, 2);
    assertEquals(3, arr[1]);
    assertEquals(2, arr[2]);

  }
  @Test
  public void testPartition(){
      int[] arr = new int[]{2,3,4,1};
      App.partition(arr, 0, 3);

      assertEquals(1, arr[0]);
      assertEquals(2, arr[3]);

      App.partition(arr, 1, 3);
      assertEquals(2, arr[1]);
      assertEquals(3, arr[3]);

      App.partition(arr, 1, 3);
      assertEquals(3, arr[2]);
      assertEquals(4, arr[3]);
  }
  @Test
  public void testQuickSort(){
    int[] arr = new int[]{2,3,4,1};
    int[] sortedArr = new int[]{1,2,3,4};
    App.quickSort(arr, 0, arr.length-1);

    assertTrue(Arrays.equals(arr, sortedArr));

    arr = new int[]{8,4,23,42,16,15,2};
    sortedArr = new int[]{2, 4, 8, 15, 16, 23, 42};
    App.quickSort(arr, 0, arr.length-1);

    assertTrue(Arrays.equals(arr, sortedArr));
  }
}
