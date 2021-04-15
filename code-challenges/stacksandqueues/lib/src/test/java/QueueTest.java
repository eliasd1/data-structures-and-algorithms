import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QueueTest {
  @Test
  public void testQueue(){
    Queue queue = new Queue();
    assertTrue(queue.isEmpty());
    try{
      queue.dequeue();
    }catch(NullPointerException exception){
      System.out.println(exception.getMessage());
    }

    queue.enqueue(5);
    assertEquals(5, queue.peek().getData());
    queue.enqueue(10);
    assertEquals(5, queue.peek().getData());
    assertEquals(5, queue.dequeue().getData());
    assertEquals(10, queue.peek().getData());
  }
}
