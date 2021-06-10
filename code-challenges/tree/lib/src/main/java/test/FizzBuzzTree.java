package test;

import queue.Queue;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTree{
  public static void main(String[] args) {
      BinaryTree tree = new BinaryTree();
      tree.add(15);
      tree.add(1);
      tree.add(20);
      BinaryTree newTree = fizzBuzzTree(tree);
    System.out.println(newTree.getRoot().getValue());
  }
  public static BinaryTree fizzBuzzTree(BinaryTree tree){
    BinaryTree newTree = new BinaryTree();
    Node root = tree.getRoot();
    for(Node node : breadthFirstSearch(root)){
      int number = (int) node.getValue();
      if(number % 3 == 0 && number % 5 == 0){
        newTree.add("FizzBuzz");
      } else if(number % 3 == 0){
        newTree.add("Fizz");
      } else if(number % 5 == 0){
        newTree.add("Buzz");
      } else{
        newTree.add(number);
      }
    }
    return newTree;
  }
//  public static void depthFirstSearch(Node root, List<Node> nodes){
//    nodes.add(root);
//    if(root.getLeft() != null){
//      depthFirstSearch(root.getLeft(), nodes);
//    }
//    if(root.getRight() != null){
//      depthFirstSearch(root.getRight(),nodes);
//    }
//  }
  public static List<Node> breadthFirstSearch(Node root){
    List<Node> nodes = new ArrayList<>();
    Queue queue = new Queue();
    queue.enqueue(root);
    while (!queue.isEmpty()) {
      Node current = (Node) queue.dequeue().getData();
      nodes.add(current);
      if (current.getLeft() != null)
        queue.enqueue(current.getLeft());
      if (current.getRight() != null){
        queue.enqueue(current.getRight());
      }
    }
    return nodes;
  }
}
