package breadth_first_graph;

import DepthFirst.DepthFirst;
import graph.Graph;
import graph.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DepthFirstSearch {
  @Test
  public void testPreOrder(){
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

    List<Node> check = new ArrayList<>();
    check.add(firstNode);
    check.add(secondNode);
    check.add(thirdNode);
    check.add(fourthNode);

    assertEquals(check, DepthFirst.traverseGraph(graph));

    graph.addEdge(firstNode, fifthNode, 50);
    check.add(fifthNode);

    assertEquals(check, DepthFirst.traverseGraph(graph));

    check = new ArrayList<>();
    Node sixthNode = new Node(40);

    check.add(firstNode);
    check.add(secondNode);
    check.add(thirdNode);
    check.add(fourthNode);
    check.add(sixthNode);
    check.add(fifthNode);
    graph.addNode(sixthNode);
    graph.addEdge(fourthNode, sixthNode, 100);

    assertEquals(check, DepthFirst.traverseGraph(graph));

  }
}
