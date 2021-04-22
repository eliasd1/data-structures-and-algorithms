package tree;

public class BinarySearchTree<T>{
  private Node root = null;
  private Node current = null;

  public void add(int value) {
    if (root == null) {
      root = new Node(value);
      current = new Node(value);
    } else {
        if(value < (int) current.getValue()){
          if(current.getLeft() == null){
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

}
