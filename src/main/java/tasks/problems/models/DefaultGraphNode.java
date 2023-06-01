package tasks.problems.models;

import java.util.List;

public class DefaultGraphNode implements GraphNode {

  private int value;
  private List<GraphNode> children;

  public DefaultGraphNode(int value, List<GraphNode> children) {
    this.value = value;
    this.children = children;
  }

  public DefaultGraphNode(int value) {
    this.value = value;
  }

  @Override
  public int getValue() {
    return value;
  }

  @Override
  public List<GraphNode> getChildren() {
    return children;
  }

  public void setChildren(List<GraphNode> children) {
    this.children = children;
  }
}
