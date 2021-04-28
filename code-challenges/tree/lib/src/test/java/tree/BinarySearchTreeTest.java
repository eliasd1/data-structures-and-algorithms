package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BinarySearchTreeTest {
  @Test
  public void testBinarySearchTree(){
    BinarySearchTree searchTree = new BinarySearchTree();
    Tree tree = new Tree();
    searchTree.add(10);
    searchTree.add(20);
    searchTree.add(2);
    searchTree.add(3);
    searchTree.add(15);
    searchTree.add(50);
    searchTree.add(25);
    searchTree.add(1);
    assertEquals(new ArrayList<>(Arrays.asList(10,2,1,3,20,15,50,25)), tree.preOrder(searchTree.getRoot()));
//    System.out.println(tree.breadthFirst(searchTree));
    BinarySearchTree secondTree = new BinarySearchTree();
    secondTree.add(10);
    secondTree.add(20);
    secondTree.add(2);
    secondTree.add(3);
    System.out.println(searchTree.checkFolders(secondTree, secondTree));
  }
}
