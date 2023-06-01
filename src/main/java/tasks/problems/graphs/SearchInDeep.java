package tasks.problems.graphs;

import tasks.problems.models.GraphNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SearchInDeep {


  public int findShortestWay(GraphNode root) {
    Queue<GraphNode> nodes = new LinkedList<>();
    Map<GraphNode, Integer> shortestPath = new HashMap<>();
    nodes.add(root);
    shortestPath.put(root, 0);
    GraphNode curNode;
    while (!nodes.isEmpty()) {
      curNode = nodes.poll();
      if (curNode.getChildren().isEmpty()) {
        return shortestPath.get(curNode);
      }
      curNode.getChildren().forEach(nodes::add);
      Integer childPath = shortestPath.get(curNode) + 1;
      curNode.getChildren().forEach(child -> shortestPath.putIfAbsent(child, childPath));
    }
    return 0;
  }
}
