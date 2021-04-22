package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TreeTest {
  @Test
  public void testTree(){
    Tree tree = new Tree();
    Node sixth = new Node("F");
    Node fifth = new Node("E");
    Node fourth = new Node("D");
    Node third = new Node("C", sixth, null);
    Node second = new Node("B", fourth, fifth);
    Node first = new Node("A", second, third);

    assertEquals(new ArrayList<>(Arrays.asList("A", "B", "D", "E", "C", "F")), tree.preOrder(first));
    assertEquals(new ArrayList<>(Arrays.asList("D", "B", "E", "A", "F", "C")), tree.inOrder(first));
    assertEquals(new ArrayList<>(Arrays.asList("D", "E", "B", "F", "C", "A")), tree.postOrder(first));
  }

}
