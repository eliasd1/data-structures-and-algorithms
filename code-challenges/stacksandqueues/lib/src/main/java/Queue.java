public class Queue<T>{
  private Node front = null;
  private Node rear = null;

  public void enqueue(T object){
    if(this.isEmpty()){
      front = new Node(object);
      rear = new Node(object);
    }
    else{
      rear.setNext(new Node(object));
      rear = new Node(object);

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

  @Override
  public String toString() {
    return "Queue{" +
      "front=" + front.getData() +
      ", rear=" + rear.getData() +
      '}';
  }
}
