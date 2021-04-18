import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StackTest {
  @Test public void testStack(){
    Stack stack = new Stack();
    Stack secondStack = new Stack();
    stack.push(5);
    stack.push(8);
    stack.push(10);
    System.out.println("Test if pop works");
    assertEquals(10, stack.pop().getData());
    System.out.println("Test if peek works");
    assertEquals(8, stack.peek().getData());
    System.out.println("Test if isEmpty function works");
    assertFalse(stack.isEmpty());
  }
}
