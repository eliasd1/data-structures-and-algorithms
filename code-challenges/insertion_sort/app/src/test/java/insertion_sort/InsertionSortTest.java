package insertion_sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InsertionSortTest {
  @Test
  public void testInsertionSort(){
    int[] arr = new int[]{5,4,1,0};
    int[] sortedArr = new int[]{0,1,4,5};
    assertTrue(Arrays.equals(App.insertionSort(arr), sortedArr));
    arr = new int[]{0,0,2,1};
    sortedArr = new int[]{0,0,1,2};
    assertTrue(Arrays.equals(App.insertionSort(arr), sortedArr));
    assertEquals(0, App.insertionSort(new int[]{}).length);
    assertEquals(null, App.insertionSort(null));
    arr = new int[]{1};
    assertEquals(arr, App.insertionSort(arr));
  }
}
