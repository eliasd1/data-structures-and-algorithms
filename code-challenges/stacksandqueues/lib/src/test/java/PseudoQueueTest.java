import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PseudoQueueTest {
  @Test public void testPseudoQueue(){
    PseudoQueue queue = new PseudoQueue();
    queue.enqueue(50);
    queue.enqueue(10);
    queue.enqueue(20);

    assertEquals(50, queue.getStack().peek().getData());
    assertEquals(50, queue.dequeue().getData());
    assertEquals(10, queue.getStack().peek().getData());
    queue = new PseudoQueue();
    queue.enqueue(null);
    assertEquals(null, queue.dequeue());
  }
}
