package graph;

import hashtable.HashTable;

public class Node {
  private Object object;
  private HashTable edges = null;

  public Node(Object object){
    this.object = object;
  }
  public void setEdge(Node edge, int weight){
    edges.add(edge, weight);
  }

  public HashTable edges(){
    return edges;
  }
  public Object value() {
    return object;
  }
}
