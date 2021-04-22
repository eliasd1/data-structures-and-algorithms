package tree;

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
