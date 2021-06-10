package test;

import queue.Queue;


public class BinaryTree {
  Node root = null;
  Queue queue = new Queue();
  public void add(Object value) {
    addRecursive(root, value);
  }
  private void addRecursive(Node current, Object value) {
    if (root == null) {
      root = new Node(value);
    } else{
      if(current.getLeft() == null){
        current.setLeft(new Node(value));
        queue.enqueue(current.getLeft());
      } else if(current.getRight() == null){
        current.setRight(new Node(value));
        queue.enqueue(current.getRight());
      } else{
        if(current == root){
          addRecursive((Node) queue.peek().getData(),value);
        } else{
          if(!queue.isEmpty()){
            Node newNode = (Node) queue.dequeue().getData();
            addRecursive(newNode, value);
          }
        }
      }
    }
  }
  public int findMaximumNumber(){
    int max = Integer.MIN_VALUE;
    for(Node node: FizzBuzzTree.breadthFirstSearch(getRoot())){
      if(Math.max(max, (int) node.getValue()) > max){
        max = (int) node.getValue();
      }
    }
    return max;
  }
  public Node getRoot(){
    return root;
  }
}
