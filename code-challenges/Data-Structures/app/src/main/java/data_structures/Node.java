package data_structures;

public class Node {
  private Object object;
  private Node next = null;

  public Node(Object object){
    this.object = object;
  }
  public void setNext(Node node){
    this.next = node;
  }
  public Node next(){
    return next;
  }
  public Object value() {
    return object;
  }
}
