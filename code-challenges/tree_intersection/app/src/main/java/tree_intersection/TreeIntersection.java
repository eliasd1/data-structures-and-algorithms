package tree_intersection;

import tree.BinarySearchTree;
import tree.Node;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection {


  public static List<Integer> findSameValues(BinarySearchTree firstTree, BinarySearchTree secondTree){
    List<Integer> sameValues = new ArrayList<>();
    if(firstTree.getSize() <= secondTree.getSize()){
      return traverseTree(firstTree.getRoot(), secondTree, sameValues);
    }
    return traverseTree(secondTree.getRoot(), firstTree, sameValues);
  }
  private static List<Integer> traverseTree(Node firstRoot, BinarySearchTree secondTree, List<Integer> sameValues){
    if(secondTree.contains((int) firstRoot.getValue())){
      sameValues.add((int) firstRoot.getValue());
    }
    if(firstRoot.getLeft() != null){
      traverseTree(firstRoot.getLeft(), secondTree, sameValues);
    }
    if(firstRoot.getRight() != null){
      traverseTree(firstRoot.getRight(), secondTree, sameValues);
    }
    return sameValues;
  }
}
