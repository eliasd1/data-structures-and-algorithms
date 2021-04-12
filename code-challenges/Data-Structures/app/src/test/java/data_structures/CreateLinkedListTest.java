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
  @Test public void testAppend(){
    ArrayList values = new ArrayList(Arrays.asList(15,10,5, 0, 5));
    ArrayList secondSet = new ArrayList(Arrays.asList(15,10,5,0,4));
    CreateLinkedList list = new CreateLinkedList();
    list.insert(5);
    list.insert(10);
    list.insert(15);
    list.append(0);
    list.append(5);
    assertEquals(values, list.getValues());
    assertNotEquals(secondSet, list.getValues());
  }
  @Test public void testInsertBefore(){
    ArrayList values = new ArrayList(Arrays.asList(20,15,10,8,5, 0, 25));
    CreateLinkedList list = new CreateLinkedList();
    list.insert(5);
    list.insert(10);
    list.insert(15);
    list.append(0);
    list.append(25);
    list.insertBefore(5, 8);
    list.insertBefore(15, 20);
    assertEquals(values, list.getValues());
  }
  @Test public void testInsertAfter(){
    ArrayList values = new ArrayList(Arrays.asList(15, 10, 5, 2, 0, 25, 50));
    CreateLinkedList list = new CreateLinkedList();
    list.insert(5);
    list.insert(10);
    list.insert(15);
    list.append(0);
    list.append(25);
    list.insertAfter(5, 2);
    list.insertAfter(25, 50);
    assertEquals(values, list.getValues());
  }
  @Test public void testFromEnd(){
    ArrayList values = new ArrayList(Arrays.asList(15, 10, 5));
    CreateLinkedList list = new CreateLinkedList();
    list.insert(5);
    list.insert(10);
    list.insert(15);
    System.out.println("Check if exception is thrown when k is greater than the length");
    try{
      System.out.println(list.fromEnd(3));
      assertTrue(false);
    } catch(IllegalArgumentException ex){
      System.out.println(ex.getMessage());
      assertTrue(true);
    }
    System.out.println("K and the length of the list are the same");
    try{
      System.out.println(list.fromEnd(2));
      assertTrue(true);
    } catch(IllegalArgumentException ex){
      System.out.println(ex.getMessage());
      assertTrue(false);
    }
    System.out.println("K is a negative number");
    try{
      System.out.println(list.fromEnd(-1));
      assertTrue(false);
    } catch(IllegalArgumentException ex){
      System.out.println(ex.getMessage());
      assertTrue(true);
    }
    CreateLinkedList newList = new CreateLinkedList();
    newList.insert(5);
    System.out.println("List is length 1");
    try{
      System.out.println(list.fromEnd(0));
      assertTrue(true);
    } catch(IllegalArgumentException ex){
      System.out.println(ex.getMessage());
      assertTrue(false);
    }
  }
}
