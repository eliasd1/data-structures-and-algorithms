package left_join;

import hashtable.HashTable;

import java.util.ArrayList;
import java.util.List;

public class LeftJoin {

  public static List<List> leftJoin(HashTable left, HashTable right){
    List<List> list = new ArrayList<>();
    for(Object key: left.getKeys()){
      List<Object> innerList = new ArrayList<>();
      innerList.add(key);
      innerList.add(left.get(key));
      if(right.get(key) != null){
        innerList.add(right.get(key));
      }
      list.add(innerList);
    }
    return list;
  }
}
