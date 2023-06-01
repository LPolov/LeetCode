package tasks.problems.models;

public class GraphWeightedRibber {
  private WeightedNode node;
  private int weight;

  public GraphWeightedRibber(WeightedNode node, int weight) {
    this.node = node;
    this.weight = weight;
  }

  public WeightedNode getNode() {
    return node;
  }

  public int getWeight() {
    return weight;
  }
}
