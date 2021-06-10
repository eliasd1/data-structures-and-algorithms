package left_join;

import hashtable.HashTable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LeftJoinTest {
  @Test public void testHashTable(){
    HashTable table = new HashTable();
    table.add("first", 1);
    table.add("second", 2);
    assertEquals(1, table.get("first"));
    assertEquals(2, table.get("second"));
  }
  @Test public void testLeftJoinTest(){
    HashTable left  = new HashTable();
    HashTable right = new HashTable();
    List<Object> checkList = new ArrayList<>();
    left.add("first", 1); // ["first", 1, "this is the first"]
    left.add("second", 2); // ["second", 2, "second"]
    left.add("third", 3);//["third", 3, "third"]
    right.add("first", "this is the first");
    right.add("second", "second");
    right.add("third", "third");
    right.add("fourth", 4);
    ArrayList<Object> firstList = new ArrayList<>();
    firstList.add(left.getKeys().get(0));
    firstList.add(left.get(left.getKeys().get(0)));
    firstList.add(right.get(left.getKeys().get(0)));
    ArrayList<Object> secondList = new ArrayList<>();
    secondList.add(left.getKeys().get(1));
    secondList.add(left.get(left.getKeys().get(1)));
    secondList.add(right.get(left.getKeys().get(1)));

    assertEquals(secondList, LeftJoin.leftJoin(left, right).get(1));
    checkList.add(left.getKeys().get(0));
    checkList.add(left.get(left.getKeys().get(0)));
    checkList.add(right.get(left.getKeys().get(0)));


    assertEquals(checkList, LeftJoin.leftJoin(left,right).get(0));

    checkList = new ArrayList<>();
    checkList.add(left.getKeys().get(2));
    checkList.add(left.get(left.getKeys().get(2)));
    checkList.add(right.get(left.getKeys().get(2)));
    assertEquals(checkList, LeftJoin.leftJoin(left,right).get(2));
  }
}
