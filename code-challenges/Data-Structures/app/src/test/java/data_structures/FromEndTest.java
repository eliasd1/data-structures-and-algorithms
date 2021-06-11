package data_structures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FromEndTest {
  @Test
  public void testFromEnd(){
    CreateLinkedList list = new CreateLinkedList();
    list.insert(50);
    list.insert(20);
    list.insert(10);
    list.insert(5);
    assertEquals(5, list.fromEnd(3));
    list.insert(2);
    assertEquals(2, list.fromEnd(4));
    assertEquals(50, list.fromEnd(0));
    assertEquals(null, list.fromEnd(10));
  }
}
