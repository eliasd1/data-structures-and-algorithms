package linkedlist;

public class Node {
  private Object key;
  private Object value;
  private Node next = null;

  public Node(Object key, Object value){
    this.key = key;
    this.value = value;
  }
  public void setNext(Node node){
    this.next = node;
  }
  public Node next(){
    return next;
  }

  public Object getKey() {
    return key;
  }

  public void setKey(Object key) {
    this.key = key;
  }

  public Object value() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }
}
