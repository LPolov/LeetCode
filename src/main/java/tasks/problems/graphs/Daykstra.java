package tasks.problems.graphs;

import tasks.problems.models.GraphNode;
import tasks.problems.models.GraphWeightedRibber;
import tasks.problems.models.WeightedNode;

import java.util.*;

public class Daykstra {

  public List<WeightedNode> findShortestWay(WeightedNode a, WeightedNode b) {
    Map<WeightedNode, Integer> paths = new HashMap<>();
    Map<WeightedNode, WeightedNode> parents = new HashMap<>();
    Queue<GraphWeightedRibber> notvisited = new PriorityQueue<>(Comparator.comparingInt(x -> x.getWeight() + paths.getOrDefault(parents.get(x.getNode()), 0)));
    WeightedNode curr;
    notvisited.add(new GraphWeightedRibber(a, 0));

    while (!notvisited.isEmpty()) {
      curr = notvisited.poll().getNode();
      List<GraphWeightedRibber> children = curr.getRibbers();
      int weight = paths.getOrDefault(curr, 0);
      for (GraphWeightedRibber child : children) {
         if (!paths.containsKey(child.getNode()) || paths.get(child.getNode()) >  weight + child.getWeight()) {
           paths.put(child.getNode(), weight + child.getWeight());
           parents.put(child.getNode(), curr);
         }
      }
      notvisited.addAll(children);
    }

    List<WeightedNode> res = new LinkedList<>();
    res.add(b);
    WeightedNode node = parents.get(b);
    while (node != null) {
      res.add(node);
      node = parents.get(node);
    }

    Collections.reverse(res);
    return res;
  }

//  private Optional<GraphNode> findMinPath(WeightedNode node) {
//    return node.getRibbers()
//        .stream()
//        .sorted(Comparator.comparingInt(GraphWeightedRibber::getWeight))
//        .map(GraphWeightedRibber::getNode)
//        .findFirst();
  //}
}
