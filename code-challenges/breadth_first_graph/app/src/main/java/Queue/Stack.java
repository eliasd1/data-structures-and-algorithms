package Queue;

public class Stack<T>{
  private Node top = null;
  private Node current = null;

  public void push(T object){
    if(this.isEmpty()){
      top = new Node(object);
      current = new Node(object);
    } else{
      current = top;
      top = new Node(object);
      top.setNext(current);
    }
  }
  public Node pop(){
    if(this.isEmpty()){
      throw new NullPointerException("Stack is empty");
    } else{
      Node temp = top;
      top = top.next();
      temp.setNext(null);
      return temp;
    }
  }
  public Node peek(){
    if(this.isEmpty()){
      throw new NullPointerException("Stack is empty");
    } else{
      return top;
    }
  }
  public Boolean isEmpty(){
    if(top == null){
      return true;
    }
    return false;
  }
  @Override
  public String toString() {
    return "Stack{" +
      "top=" + top.getData() +
      ", current=" + current.getData() +
      '}';
  }
}
