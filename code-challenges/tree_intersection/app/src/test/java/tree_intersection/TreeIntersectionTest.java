package tree_intersection;

import org.junit.Test;
import tree.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TreeIntersectionTest {
  @Test
  public void testTreeIntersection(){
    BinarySearchTree firstTree = new BinarySearchTree();
    BinarySearchTree secondTree = new BinarySearchTree();

    firstTree.add(10);
    firstTree.add(5);
    firstTree.add(20);
    firstTree.add(30);
    firstTree.add(15);

    secondTree.add(20);
    secondTree.add(15);
    secondTree.add(30);

    List<Integer> check = new ArrayList<>();
    check.add(20);
    check.add(15);
    check.add(30);

    assertEquals(check, TreeIntersection.findSameValues(firstTree, secondTree));

    //Using the other method to check if true
    assertEquals(check, TreeIntersection.sameValues(firstTree, secondTree));
  }
}
