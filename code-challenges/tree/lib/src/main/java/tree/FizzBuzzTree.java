package tree;

import java.util.List;

public class FizzBuzzTree<T>{
  public static void main(String[] args) {
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
    System.out.println(fizzBuzzTree(searchTree));
  }
  public static List fizzBuzzTree(BinarySearchTree binaryTree){
    Tree tree = new Tree();
    BinarySearchTree newTree = new BinarySearchTree();
    for(Object value : tree.breadthFirst(binaryTree)){
      int number = (int) value;
      if(number % 3 == 0 && number % 5 == 0){
        
      }
    }
    return tree.breadthFirst(binaryTree);
  }
}
