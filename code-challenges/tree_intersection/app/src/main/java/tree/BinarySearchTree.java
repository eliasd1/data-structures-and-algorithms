package tree;

public class BinarySearchTree<T>{
  private Node root = null;
  private Node current = null;
  private int maxValue = Integer.MIN_VALUE;
  private int size = 0;

  public void add(int value) {
    if (root == null) {
      root = new Node(value);
      current = new Node(value);
      size++;
    } else {
        if(Math.max(maxValue, value) != maxValue){
          maxValue = value;
        }
        if(value < (int) current.getValue()){
          if(current.getLeft() == null){
            size++;
            current.setLeft(new Node(value));
            if(root.getLeft() == null && current.getValue().equals(root.getValue())){
              root.setLeft(current.getLeft());
            }
          } else{
            current = current.getLeft();
            add(value);
          }
        }else if(value > (int) current.getValue()){
          if(current.getRight() == null){
            size++;
            current.setRight(new Node(value));
            if(root.getRight() == null && current.getValue().equals(root.getValue())){
              root.setRight(current.getRight());
            }
          } else{
            current = current.getRight();
            add(value);
          }
        }
        current = root;
    }
  }
  public boolean checkFolders(BinarySearchTree firstTree, BinarySearchTree secondTree){
    return checkFoldersAlgo(firstTree.getRoot(), 0) == checkFoldersAlgo(secondTree.getRoot(), 0);
  }
  public int checkFoldersAlgo(Node root, int number){
    if(root.getLeft() != null){
      number = checkFoldersAlgo(root.getLeft(), number);
    }
    if(root.getRight() != null){
      number = checkFoldersAlgo(root.getRight(), number);
    }
    if(root.getLeft() == null && root.getRight() == null){
      number += 1;
    }
    return number;
  }
  public int findMaximumValue(){
    return maxValue;
  }
  public boolean contains(int value){
    return containsAlgo(root, value);
  }

  public boolean containsAlgo(Node current, int value){
    if(current == null){
      return false;
    }
    if(value == (int) current.getValue()){
      return true;
    } else if(value > (int) current.getValue()){
      return containsAlgo(current.getRight(), value);
    } else{
      return containsAlgo(current.getLeft(), value);
    }
  }
  public Node getRoot(){
    return root;
  }
  public int getSize(){
      return size;
  }
}
