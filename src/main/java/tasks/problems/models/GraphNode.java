package tasks.problems.models;

import java.util.List;

public interface GraphNode {

  int getValue();
  List<GraphNode> getChildren();
}
