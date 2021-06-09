/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package breadth_first_graph;

import GetEdges.GetEdges;
import graph.Graph;
import graph.Node;

public class App {

    public static void main(String[] args) {
      Graph graph = new Graph();
      Node firstNode = new Node(5);
      Node secondNode = new Node(10);
      Node thirdNode = new Node(20);
      Node fourthNode = new Node(30);
      Node fifthNode = new Node(10);
      graph.addNode(firstNode);
      graph.addNode(secondNode);
      graph.addNode(thirdNode);
      graph.addNode(fourthNode);
      graph.addNode(fifthNode);

      graph.addEdge(firstNode, secondNode, 5);
      graph.addEdge(secondNode, thirdNode, 10);
      graph.addEdge(thirdNode, fourthNode, 20);

      System.out.println(GetEdges.getCost(graph, new String[]{"first", "second", "third", "fourth"}));
      System.out.println(BreadthFirst.nodeExists(firstNode, secondNode, graph));
    }
}
