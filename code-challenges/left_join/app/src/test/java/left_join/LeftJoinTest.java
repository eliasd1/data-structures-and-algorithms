package left_join;

import hashtable.HashTable;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LeftJoinTest {
  @Test public void testLeftJoinTest(){
    HashTable left  = new HashTable();
    HashTable right = new HashTable();
    left.add("first", 1);
    left.add("second", 2);
    right.add("first", "this is the first");
    right.add("second", "second");
    right.add("third", 3);
    ArrayList<Object> firstList = new ArrayList<>();
    firstList.add(left.getKeys().get(0));
    firstList.add(left.get(left.getKeys().get(0)));
    firstList.add(right.get(left.getKeys().get(0)));
    ArrayList<Object> secondList = new ArrayList<>();
    secondList.add(left.getKeys().get(1));
    secondList.add(left.get(left.getKeys().get(1)));
    secondList.add(right.get(left.getKeys().get(1)));
    assertEquals(secondList, LeftJoin.leftJoin(left, right).get(1));
  }
}
