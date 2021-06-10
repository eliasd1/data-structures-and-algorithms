package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BreadthFirstTest<T>{
  @Test
  public void testBreadthFirst(){
      Tree tree = new Tree();
      BinarySearchTree searchTree = new BinarySearchTree();
      searchTree.add(2);
      searchTree.add(1);
      searchTree.add(3);
    List<Object> list = new ArrayList<>();
    list.add(2);
    list.add(1);
    list.add(3);
    assertEquals(list, tree.breadthFirst(searchTree));
    searchTree.add(5);
    list.add(5);
    assertEquals(list, tree.breadthFirst(searchTree));
  }
}
