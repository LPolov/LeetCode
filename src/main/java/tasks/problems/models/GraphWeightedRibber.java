package tasks.problems.models;

public class GraphWeightedRibber {
  private GraphNode node;
  private int weight;

  public GraphWeightedRibber(WeightedNode node, int weight) {
    this.node = node;
    this.weight = weight;
  }

  public GraphNode getNode() {
    return node;
  }

  public int getWeight() {
    return weight;
  }
}
