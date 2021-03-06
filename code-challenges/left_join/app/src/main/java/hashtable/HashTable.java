package hashtable;

import linkedlist.CreateLinkedList;
import linkedlist.Node;

import java.util.ArrayList;
import java.util.List;

public class HashTable {
    CreateLinkedList[] storedData = new CreateLinkedList[256];
    List<Object> keys = new ArrayList<>();

    public void add(Object key, Object value){
      if(!keys.contains(key)){
        keys.add(key);
      }
      int hashValue = hash(key);
      if(!(storedData[hashValue] instanceof CreateLinkedList)){
        CreateLinkedList linkedList = new CreateLinkedList();
        linkedList.insert(key, value);
        storedData[hashValue] = linkedList;
      } else{
        CreateLinkedList linkedList = storedData[hashValue];
        Node current = linkedList.head;
        while(current != null){
          if(current.getKey().equals(key)){
            break;
          }
          current = current.next();
        }
        if(current == null){
          linkedList.insert(key, value);
        }
      }
    }

    public Object get(Object key){
      if(storedData[hash(key)] instanceof CreateLinkedList){
        CreateLinkedList linkedList = storedData[hash(key)];
        Node current = linkedList.head;
        while(current != null){
          if(current.getKey().equals(key)){
            return current.value();
          }
          current = current.next();
        }
      }
      return null;
    }
    public boolean contains(Object key){
      if(get(key) != null){
        return true;
      }
      return false;
    }
    private int hash(Object key){
      if(key instanceof String){
        return (599*((String) key).length()) % 256;
      } else if(key instanceof Integer){
        return (599* (int) key) % 256;
      }
      throw new IllegalArgumentException("Must be a string or a number");
    }
    public List<Object> getKeys(){
      return keys;
    }
}
