package tasks.problems.models;

import java.util.List;

public class WeightedNode implements GraphNode {

  private String name;
  private List<GraphWeightedRibber> ribbers;


  public WeightedNode(String name) {
    this.name = name;
  }

  public WeightedNode(String name, List<GraphWeightedRibber> ribbers) {
    this.name = name;
    this.ribbers = ribbers;
  }

  @Override
  public String getName() {
    return name;
  }

  public List<GraphWeightedRibber> getRibbers() {
    return ribbers;
  }

  public void setRibbers(List<GraphWeightedRibber> ribbers) {
    this.ribbers = ribbers;
  }
}
