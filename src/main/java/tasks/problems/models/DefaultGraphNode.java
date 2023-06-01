package tasks.problems.models;

import java.util.List;

public class DefaultGraphNode implements GraphNode {

  private String name;
  private List<GraphNode> children;

  public DefaultGraphNode(String name, List<GraphNode> children) {
    this.name = name;
    this.children = children;
  }

  public DefaultGraphNode(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  public List<GraphNode> getChildren() {
    return children;
  }

  public void setChildren(List<GraphNode> children) {
    this.children = children;
  }
}
