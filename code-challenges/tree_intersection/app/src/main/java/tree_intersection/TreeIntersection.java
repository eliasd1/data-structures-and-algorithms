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
  public static List<Integer> sameValues(BinarySearchTree firstTree, BinarySearchTree secondTree){
    List<Integer> list = new ArrayList<>();
    check(firstTree.getRoot(), secondTree.getRoot(), list);
    return list;
  }
  public static void check(Node firstRoot, Node secondRoot, List<Integer> list){
    if(firstRoot != null && secondRoot != null){
      if((int) firstRoot.getValue() == (int) secondRoot.getValue() && !list.contains((int) firstRoot.getValue())){
        list.add((int) firstRoot.getValue());
      }
      if((int) firstRoot.getValue() < (int) secondRoot.getValue()){
        check(firstRoot.getRight(), secondRoot, list);
        check(firstRoot, secondRoot.getLeft(), list);
      } else{
        check(firstRoot.getLeft(), secondRoot, list);
        check(firstRoot, secondRoot.getRight(), list);
      }
    }
  }

}
