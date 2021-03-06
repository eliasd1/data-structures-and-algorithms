package graph;

import hashtable.HashTable;

import java.util.ArrayList;
import java.util.List;

public class Node {
  private Object object;
  private HashTable edges = new HashTable();
  private List<Node> nodeEdges = new ArrayList<>();

  public Node(Object object){
    this.object = object;
  }
  public void setEdge(Node edge, int weight){
    edges.add(edge, weight);
    nodeEdges.add(edge);
  }

  public HashTable edges(){
    return edges;
  }
  public List<Node> getNodeEdges(){
    return nodeEdges;
  }
  public Object value() {
    return object;
  }
}
