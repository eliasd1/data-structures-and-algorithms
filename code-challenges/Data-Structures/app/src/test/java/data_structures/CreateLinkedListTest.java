package data_structures;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class CreateLinkedListTest {
  @Test public void testInstantiate() {
    CreateLinkedList classUnderTest = new CreateLinkedList();
    assertNotNull("Unsuccessfully instantiated", classUnderTest);
  }
  @Test public void testInsert(){
    CreateLinkedList list = new CreateLinkedList();
    assertEquals(5, list.insert(5).value());
    assertNotEquals(10, list.insert(5).value());
  }
  @Test public void testGetFirstValue(){
    CreateLinkedList list = new CreateLinkedList();
    list.insert(5);
    list.insert(10);
    list.insert(15);
    assertEquals(15, list.getFirstValue());
    assertNotEquals(10, list.getFirstValue());
  }
  @Test public void testIncludes(){
    CreateLinkedList list = new CreateLinkedList();
    list.insert(5);
    list.insert(10);
    list.insert(15);
    assertTrue(list.includes(5));
    assertFalse(list.includes(20));
  }
  @Test public void testGetValues(){
    ArrayList values = new ArrayList(Arrays.asList(15,10,5));
    CreateLinkedList list = new CreateLinkedList();
    list.insert(5);
    list.insert(10);
    list.insert(15);
    assertEquals(values, list.getValues());
  }

}
