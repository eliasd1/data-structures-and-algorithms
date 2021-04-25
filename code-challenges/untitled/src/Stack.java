
public class Stack<T>{
  private Node top = null;
  private Node current = null;
  private Node maxNumber = null;

  public void push(T object){
    if(this.isEmpty()){
      top = new Node(object);
      current = new Node(object);
      maxNumber = new Node(object);
    } else{
      current = top;
      top = new Node(object);
      top.setNext(current);
      if(Math.max((int) maxNumber.getData(), (int) object) != (int) maxNumber.getData() || maxNumber.getData().equals(object)){
        current = maxNumber;
        maxNumber = top;
        maxNumber.setNext(current);
      }
    }
  }
  public Node pop(){
    if(this.isEmpty()){
      throw new NullPointerException("Stack is empty");
    } else{
      if(maxNumber.getData().equals(top.getData())){
        maxNumber = maxNumber.next();
      }
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
  public int getMax(){
    return (int) maxNumber.getData();
  }
  @Override
  public String toString() {
    return "Stack{" +
      "top=" + top.getData() +
      ", current=" + current.getData() +
      '}';
  }
}
