package DepthFirst;

import graph.Graph;
import graph.Node;

import java.util.ArrayList;
import java.util.List;

public class DepthFirst {
  public static void main(String[] args) {
    Graph graph = new Graph();
    Node firstNode = new Node(5);
    Node secondNode = new Node(10);
    Node thirdNode = new Node(20);
    Node fourthNode = new Node(30);
    Node fifthNode = new Node(50);
    graph.addNode(firstNode);
    graph.addNode(secondNode);
    graph.addNode(thirdNode);
    graph.addNode(fourthNode);
    graph.addNode(fifthNode);
    graph.addEdge(firstNode, secondNode, 5);
    graph.addEdge(secondNode, thirdNode, 10);
    graph.addEdge(thirdNode, fourthNode, 20);
    graph.addEdge(firstNode, fifthNode, 50);

    for(Node node: traverseGraph(graph)){
      System.out.println(node.value());
    }
  }
  public static List<Node> traverseGraph(Graph graph){
    List<Node> nodes = new ArrayList<>();
    List<Node> visited = new ArrayList<>();
    preOrder(graph.getHead(), nodes, visited);
    return nodes;
  }
  public static void preOrder(Node root, List<Node> nodes, List<Node> visited){
    if(!nodes.contains(root)){
      nodes.add(root);
    }
    if(visited.size() < 1){
      visited.add(root);
    }
    if(root.getNodeEdges() != null){
      for(Node node: root.getNodeEdges()){
        if(!visited.contains(node)){
          visited.add(node);
          preOrder(node, nodes, visited);
        }
      }
    }
  }
}
