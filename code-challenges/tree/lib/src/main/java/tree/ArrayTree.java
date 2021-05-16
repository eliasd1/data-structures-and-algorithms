package tree;

public class ArrayTree<T>{
  private ArrayNode root = null;
  private ArrayNode current = null;
  private int k;

  public void ArrayTree(int k){
    this.k = k;
  }

  public void add(T value){
    if(root == null){
      root = new ArrayNode(value);
      current = new ArrayNode(value);
    } else{
      if(current.getChildren().size() < k){

      }
    }
  }
  public void addAlgo(ArrayNode root, T value){
    if(root.getChildren().size() < k){
      root.add(new ArrayNode(value));
    }
  }
}
