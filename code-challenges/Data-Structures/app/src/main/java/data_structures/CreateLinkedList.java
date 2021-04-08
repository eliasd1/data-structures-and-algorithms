package data_structures;

import java.util.ArrayList;

public class CreateLinkedList {
  public Node head = null;
  public Node current = null;

  public Node insert(Object object){
    if(head == null){
      this.head = new Node(object);
      this.current = new Node(object);
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
  @Override
  public String toString() {
    Node current = head;
    String string = "";
    while(current != null){
      string += "{" + current.value() + "} -> ";
      current = current.next();
    }
    string += "NULL";
    return string;
  }
}
