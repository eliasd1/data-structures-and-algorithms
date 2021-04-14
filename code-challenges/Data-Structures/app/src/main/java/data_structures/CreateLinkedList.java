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
    Node current = head;
    while(current.next() != null){
      current = current.next();
    }
    current.setNext(new Node(object));
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
  public boolean isPalindrome(){
    for(int i = 0; i<= this.getValues().size()/2; i++){
      if(this.getValues().get(i) != this.getValues().get(getValues().size()-1-i)){
        return false;
      }
    }
    return true;
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
  public static CreateLinkedList zipLists(CreateLinkedList one, CreateLinkedList two){
    if(one.getValues().size() == two.getValues().size()){
      CreateLinkedList list = new CreateLinkedList();
      for(int i = 0; i<one.getValues().size(); i++){
        if(i == 0){
          list.insert(one.getValues().get(i));
        } else{
          list.append(one.getValues().get(i));
        }
        list.append(two.getValues().get(i));
      }
      return list;
    } else{
      throw new IllegalArgumentException("List must be of the same size");
    }
  }
}
