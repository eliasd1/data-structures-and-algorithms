package breadth_first_graph;

import graph.Graph;
import graph.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BreadthFirstSearch {
  @Test
  public void testBreadthFirst(){
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

    List<Node> checkList = new ArrayList<>();
    checkList.add(firstNode);
    checkList.add(secondNode);
    checkList.add(thirdNode);
    assertEquals(checkList, BreadthFirst.breadthFirst(firstNode));

    graph.addEdge(thirdNode, fourthNode, 20);
    checkList.add(fourthNode);
    assertEquals(checkList, BreadthFirst.breadthFirst(firstNode));

    graph.addEdge(fourthNode, fifthNode, 50);
    checkList.add(fifthNode);
    assertEquals(checkList, BreadthFirst.breadthFirst(firstNode));

  }
}
