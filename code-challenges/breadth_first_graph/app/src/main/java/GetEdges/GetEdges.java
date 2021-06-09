package GetEdges;

import Queue.Stack;
import graph.Graph;
import graph.Node;

import java.util.ArrayList;
import java.util.List;

public class GetEdges {
  public static boolean directFlight(Graph graph, String[] cityNames){
    if(getCost(graph, cityNames) > 0){
      return true;
    }
    return false;
  }
  public static int getCost(Graph graph, String[] cityNames){
      List<Node> list = traverseGraph(graph);
      List<Node> updatedList = new ArrayList<>();

      int price = 0;
      for(Node node: list){
        if(node.getNodeEdges().size() <= 1 && list.get(0) != node){
          break;
        }
        updatedList.add(node);
      }
      if(cityNames.length - updatedList.size() > 1 && cityNames.length - updatedList.size() <= 0){
        return -1;
      }
      for(int i = 0; i<updatedList.size(); i++){
        price += (int) updatedList.get(i).edges().get(list.get(i+1));
      }

      return price;
  }
  public static List<Node> traverseGraph(Graph graph){
    Stack stack = new Stack();
    List<Node> list = new ArrayList<>();
    List<Node> visited = new ArrayList<>();
    Node current = graph.getNodes().get(0);
    stack.push(current);
    visited.add(current);
    while(!stack.isEmpty()){
      current = (Node) stack.pop().getData();
      list.add(current);
      if(current.getNodeEdges() != null){
        for(Node edge: current.getNodeEdges()){
          if(!visited.contains(edge)){
            stack.push(edge);
            visited.add(edge);
          }
        }
      }
    }
    return list;
  }
}

