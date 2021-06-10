package graph;

import hashtable.HashTable;

import java.util.ArrayList;
import java.util.List;

public class Graph {
  Node head = null;
  List<Node> allNodes = new ArrayList<>();
  public Node addNode(Node node){
    if(head == null){
      head = node;
    }
    if(!(allNodes.contains(node))){
      allNodes.add(node);
      return node;
    }
    return null;
  }
  public void addEdge(Node firstNode, Node secondNode, int weight){
    if(allNodes.contains(firstNode) || allNodes.contains(secondNode)){
      if(allNodes.contains(firstNode) && allNodes.contains(secondNode)){
        firstNode.setEdge(secondNode, weight);
        secondNode.setEdge(firstNode, weight);
      } else if(allNodes.contains(firstNode)){
        firstNode.setEdge(secondNode,weight);
      } else{
        secondNode.setEdge(firstNode, weight);
      }
    }
  }
  public List<Node> getNodes(){
    if(head == null){
      return null;
    }
    return allNodes;
  }
  public HashTable getNeighbors(Node node){
    if(allNodes.contains(node)){
      return node.edges();
    }
    return null;
  }
  public int getSize(){
    return allNodes.size();
  }
  public Node getHead(){
    return head;
  }
}
