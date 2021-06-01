package breadth_first_graph;

import Queue.Queue;
import graph.Node;

import java.util.ArrayList;
import java.util.List;

public class BreadthFirst {

  public static List<Object> breadthFirst(Node node){
    List<Object> list = new ArrayList<>();
    List<Object> visited = new ArrayList<>();
    Queue queue = new Queue<>();
    queue.enqueue(node);
//    list.add(node);
    while(!queue.isEmpty()){
      Node visitedNode = (Node) queue.dequeue().getData();
      visited.add(visitedNode);
      list.add(visitedNode);
      if(visitedNode.getNodeEdges() != null){
        for(Node edge: visitedNode.getNodeEdges()){
          if(!visited.contains(edge)){
//            list.add(edge);
            queue.enqueue(edge);
          }
        }
      }
    }
    return list;
  }
}
