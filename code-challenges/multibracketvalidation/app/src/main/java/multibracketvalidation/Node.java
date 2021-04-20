package multibracketvalidation;

public class Node<T>{
  private T data;
  private Node next;

  public Node(T object){
    this.data = object;
    this.next = null;
  }
  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public Node next(){
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return "Node{" +
      "data=" + data +
      ", next=" + next +
      '}';
  }
}
