package queue;

public class Queue<T>{
  private Node front = null;
  private Node rear = null;
  private Node current = null;

  public void enqueue(T object){
    if(this.isEmpty()){
      front = new Node(object);
      rear = new Node(object);
      current = new Node(object);
    }
    else{
      current = rear;
      rear = new Node(object);
      current.setNext(rear);
      if(front.next() == null){
        front.setNext(rear);
      }
    }
  }
  public Node dequeue(){
    if(this.isEmpty()){
        throw new NullPointerException("The queue is empty");
    } else{
      Node temp = front;
      front = front.next();
      temp.setNext(null);
      return temp;
    }
  }
  public Node peek(){
    if(this.isEmpty()){
      throw new NullPointerException("The queue is empty");
    } else{
      return front;
    }
  }
  public Boolean isEmpty(){
    if(front == null && rear == null){
      return true;
    }
    return false;
  }
  public Node getRear(){
    return rear;
  }
  @Override
  public String toString() {
    return "Queue{" +
      "front=" + front.getData() +
      ", rear=" + rear.getData() +
      '}';
  }
}
