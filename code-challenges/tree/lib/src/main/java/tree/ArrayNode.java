package tree;

import java.util.List;

public class ArrayNode<T>{
  private T value;
  private List<ArrayNode> children;

  public ArrayNode(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public void add(ArrayNode node){
    this.children.add(node);
  }
  public List<ArrayNode> getChildren(){
    return children;
  }
}
