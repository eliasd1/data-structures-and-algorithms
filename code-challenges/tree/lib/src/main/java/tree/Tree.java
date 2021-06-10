package tree;
import queue.Queue;

import java.util.ArrayList;
import java.util.List;

public class Tree<T>{
  private Node root;
  private List<T> list = new ArrayList();

  public List<T> preOrder(Node root){
    list = new ArrayList<>();
    return getOrder(root, "preOrder", list);
  }

  public List<T> inOrder(Node root){
    list = new ArrayList<>();
    return getOrder(root, "inOrder", list);
  }
  public List<T> postOrder(Node root){
    list = new ArrayList<>();
    return getOrder(root, "postOrder", list);
  }
  public List<T> breadthFirst(BinarySearchTree tree){
    list = new ArrayList<>();
    Queue queue = new Queue();
    queue.enqueue(tree.getRoot());

    while(queue.peek() != null){
      Node value = (Node) queue.peek().getData();
      if(value.getLeft() != null){
        queue.enqueue(value.getLeft());
      }
      if(value.getRight() != null){
        queue.enqueue(value.getRight());
      }
      list.add((T)((Node) queue.dequeue().getData()).getValue());
    }
    return list;
  }

  public List<T> getOrder(Node root, String order, List<T> list){
    if(root == null){
      throw new NullPointerException("Root must be an object");
    }
    if(order == "preOrder"){
      list.add((T) root.getValue());
    }
    if(root.getLeft() != null){
      getOrder(root.getLeft(), order, list);
    }
    if(order == "inOrder"){
      list.add((T) root.getValue());
    }
    if(root.getRight() != null){
      getOrder(root.getRight(), order, list);
    }
    if(order == "postOrder"){
      list.add((T) root.getValue());
    }
    return list;
  }
}
