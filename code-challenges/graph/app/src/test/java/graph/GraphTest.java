package graph;

import hashtable.HashTable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {
  @Test
  public void testAddNode(){
    Graph graph = new Graph();
    Node firstNode = new Node(5);

    assertEquals(firstNode, graph.addNode(firstNode));
  }
  @Test
  public void testAddEdge(){
    Graph graph = new Graph();
    Node firstNode = new Node(5);
    Node secondNode = new Node(10);

    graph.addNode(firstNode);
    graph.addNode(secondNode);

    graph.addEdge(firstNode, secondNode, 10);

    HashTable table = firstNode.edges();

    assertEquals(10, table.get(secondNode));
  }
  @Test
  public void testAllNodes(){
    Graph graph = new Graph();
    Node firstNode = new Node(5);
    Node secondNode = new Node(10);

    graph.addNode(firstNode);
    graph.addNode(secondNode);

    List<Node> check = new ArrayList<>();
    check.add(firstNode);
    check.add(secondNode);

    assertEquals(check, graph.getNodes());
  }

  @Test
  public void testNeighbors(){
    Graph graph = new Graph();
    Node firstNode = new Node(5);
    Node secondNode = new Node(10);
    Node thirdNode = new Node(20);
    Node fourthNode = new Node(30);
    graph.addNode(firstNode);
    graph.addNode(secondNode);
    graph.addNode(thirdNode);
    graph.addNode(fourthNode);
    graph.addEdge(firstNode,secondNode, 10);
    graph.addEdge(firstNode, thirdNode, 20);

    List<Node> check = new ArrayList<>();
    check.add(secondNode);
    check.add(thirdNode);

    assertTrue(graph.getNeighbors(firstNode).contains(secondNode));
    assertTrue(graph.getNeighbors(firstNode).contains(thirdNode));
    assertFalse(graph.getNeighbors(firstNode).contains(fourthNode));
  }

  @Test
  public void testNeighborsWeight(){
    Graph graph = new Graph();
    Node firstNode = new Node(5);
    Node secondNode = new Node(10);
    Node thirdNode = new Node(20);
    Node fourthNode = new Node(30);
    graph.addNode(firstNode);
    graph.addNode(secondNode);
    graph.addNode(thirdNode);
    graph.addNode(fourthNode);
    graph.addEdge(firstNode,secondNode, 10);
    graph.addEdge(firstNode, thirdNode, 20);

    List<Node> check = new ArrayList<>();
    check.add(secondNode);
    check.add(thirdNode);

    assertEquals(10, graph.getNeighbors(firstNode).get(secondNode));
    assertEquals(20, graph.getNeighbors(firstNode).get(thirdNode));
    assertEquals(null, graph.getNeighbors(firstNode).get(fourthNode));
  }

  @Test
  public void testGetSize(){
    Graph graph = new Graph();
    Node firstNode = new Node(5);
    Node secondNode = new Node(10);
    Node thirdNode = new Node(20);
    Node fourthNode = new Node(30);
    graph.addNode(firstNode);
    graph.addNode(secondNode);
    graph.addNode(thirdNode);
    graph.addNode(fourthNode);

    assertEquals(4, graph.getSize());

    Node fifthNode = new Node(40);
    graph.addNode(fifthNode);
    assertEquals(5, graph.getSize());
  }

  @Test
  public void testGraph(){
    Graph graph = new Graph();
    Node firstNode = new Node(5);
    Node secondNode = new Node(10);

    graph.addNode(firstNode);

    graph.addEdge(firstNode, secondNode, 10);

    assertTrue(graph.getSize() == 1);
    assertEquals(firstNode, graph.getNodes().get(0));
    assertTrue(graph.getNeighbors(firstNode).contains(secondNode));
  }

  @Test
  public void checkEmptyGraph(){
    Node firstNode = new Node(5);
    Graph graph = new Graph();
    assertEquals(null, graph.getNodes());
    assertEquals(null, graph.getNeighbors(firstNode));
  }
}
