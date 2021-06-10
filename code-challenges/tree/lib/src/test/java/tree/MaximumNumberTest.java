package tree;

import org.junit.Test;
import test.BinaryTree;

import static org.junit.Assert.assertEquals;

public class MaximumNumberTest {
  @Test
  public void testMaximumNumberTest(){
    BinaryTree tree = new BinaryTree();
    tree.add(5);
    tree.add(40);
    tree.add(20);
    tree.add(10);
    assertEquals(40, tree.findMaximumNumber());
    tree.add(50);
    assertEquals(50, tree.findMaximumNumber());
    tree.add(5);
    assertEquals(50, tree.findMaximumNumber());
  }
}
