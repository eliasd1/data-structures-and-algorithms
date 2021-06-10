package tree;

import org.junit.Test;
import test.BinaryTree;
import test.FizzBuzzTree;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
  @Test
  public void testFizzBuzz(){
    BinaryTree tree = new BinaryTree();
    tree.add(15);
    tree.add(1);
    tree.add(9);
    tree.add(20);
    System.out.println(tree.getRoot().getRight().getValue());
    BinaryTree newTree = FizzBuzzTree.fizzBuzzTree(tree);
    assertEquals("FizzBuzz", newTree.getRoot().getValue());
    assertEquals(1, newTree.getRoot().getLeft().getValue());
    assertEquals("Fizz", newTree.getRoot().getRight().getValue());
    assertEquals("Buzz", newTree.getRoot().getLeft().getLeft().getValue());
  }
}
