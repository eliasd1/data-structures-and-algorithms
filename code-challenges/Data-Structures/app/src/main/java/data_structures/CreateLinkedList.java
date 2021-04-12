package data_structures;

import java.util.ArrayList;

public class CreateLinkedList {
  public Node head = null;
  public Node current = null;
  public Node tail =  null;

  public Node insert(Object object){
    if(head == null){
      this.head = new Node(object);
      this.current = new Node(object);
      this.tail = new Node(object);
    } else{
      this.current = head;
      this.head = new Node(object);
      this.head.setNext(current);
    }
    return new Node(object);
  }
  public boolean includes(Object object){
    Node iterate = head;
    while(iterate != null){
      if(object.equals(iterate.value())){
        return true;
      }
      iterate = iterate.next();
    }
    return false;
  }
  public Object getFirstValue(){
    return head.value();
  }
  public ArrayList getValues(){
    ArrayList allValues = new ArrayList();
    Node iterate = head;
    while(iterate != null){
      allValues.add(iterate.value());
      iterate = iterate.next();
    }
    return allValues;
  }
  public void append(Object object){
    this.tail.setNext(new Node(object));
    this.tail = tail.next();
  }
  public void insertBefore(Object object, Object newObject){
    Node current = head;
    Node newNode = new Node(newObject);
    while(current.next().value() != object && current.value() != object){
      current = current.next();
    }
    if(current.value() == object){
      this.head = newNode;
      newNode.setNext(current);
    } else{
      newNode.setNext(current.next());
      current.setNext(newNode);
    }
  }
  public void insertAfter(Object object, Object newObject){
    Node current = head;
    Node newNode = new Node(newObject);
    while(current.value() != object){
      current = current.next();
    }
    if(current.next() == null){
      this.tail = newNode;
    }
    newNode.setNext(current.next());
    current.setNext(newNode);
  }
  public Object fromEnd(int k){
    int counter = 0;
    current = head;
    while(current.next() != null){
      counter += 1;
      current = current.next();
    }
    if(counter >= k && k >= 0){
      counter = counter - k;
      current = head;
      for(int i = 0; i< counter; i++){
        current = current.next();
      }
      return current.value();
    } else{
      throw new IllegalArgumentException("Not valid input");
    }
  }

  @Override
  public String toString() {
    Node current = head;
    String string = "";
    while(current != null){
      string += "{" + current.value() + "} -> ";
      current = current.next();
    }
    string += "NULL";
    string += "\n Tail: " + this.tail.value();
    return string;
  }
}
