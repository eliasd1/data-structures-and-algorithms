package breadth_first_graph;

import GetEdges.GetEdges;
import graph.Graph;
import graph.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GetEdgesTest {
  @Test
  public void testDirectPath(){
    Node Pandora = new Node("Pandora");
    Node Metroville = new Node("Metroville");
    Node Arendelle = new Node("Arendelle");

    Graph graph = new Graph();
    graph.addNode(Pandora);
    graph.addNode(Metroville);
    graph.addNode(Arendelle);

    graph.addEdge(Pandora, Metroville, 82);
    graph.addEdge(Metroville, Arendelle, 99);
    String[] cityNames = new String[]{"Pandora", "Metroville", "Arendelle"};
    // There should be a direct path from Pandora to Arendelle
    assertTrue(GetEdges.directFlight(graph, cityNames));
  }
  @Test
  public void testTraverseGraph(){
    Node Pandora = new Node("Pandora");
    Node Metroville = new Node("Metroville");
    Node Arendelle = new Node("Arendelle");

    Graph graph = new Graph();
    graph.addNode(Pandora);
    graph.addNode(Metroville);
    graph.addNode(Arendelle);

    graph.addEdge(Pandora, Metroville, 82);
    graph.addEdge(Metroville, Arendelle, 99);

    List<Node> nodes = new ArrayList<>();
    nodes.add(Pandora);
    nodes.add(Metroville);
    nodes.add(Arendelle);
    // The return list from the traverse graph method should be in the order listed above
    assertEquals(nodes, GetEdges.traverseGraph(graph));
  }
  @Test
  public void testGetCost(){
    Node Pandora = new Node("Pandora");
    Node Metroville = new Node("Metroville");
    Node Arendelle = new Node("Arendelle");

    Graph graph = new Graph();
    graph.addNode(Pandora);
    graph.addNode(Metroville);
    graph.addNode(Arendelle);

    graph.addEdge(Pandora, Metroville, 82);
    graph.addEdge(Metroville, Arendelle, 99);

    String[] cityNames = new String[]{"Pandora", "Metroville", "Arendelle"};
    //The cost of going from Pandora to Metroville then to Arendelle should be 181
    assertEquals(181, GetEdges.getCost(graph,cityNames));
  }

}
