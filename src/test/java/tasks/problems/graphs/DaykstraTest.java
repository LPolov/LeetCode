package tasks.problems.graphs;

import org.junit.jupiter.api.Test;
import tasks.problems.models.GraphWeightedRibber;
import tasks.problems.models.WeightedNode;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class DaykstraTest {

  @Test
  void findShortestWayWeightSimple() {
    WeightedNode a = new WeightedNode("a");
    WeightedNode b = new WeightedNode("b");
    WeightedNode c = new WeightedNode("c");
    WeightedNode d = new WeightedNode("d");

    a.setRibbers(Arrays.asList(new GraphWeightedRibber(b, 1), new GraphWeightedRibber(c, 5)));
    b.setRibbers(Arrays.asList(new GraphWeightedRibber(c, 2), new GraphWeightedRibber(d, 15)));
    c.setRibbers(Arrays.asList(new GraphWeightedRibber(d, 12)));
    d.setRibbers(Collections.EMPTY_LIST);

    Daykstra daykstra = new Daykstra();
    assertEquals(Arrays.asList(a, b, c, d), daykstra.findShortestWay(a, d));
  }

  @Test
  void findShortestWayWeight() {
    WeightedNode a = new WeightedNode("a");
    WeightedNode b = new WeightedNode("b");
    WeightedNode c = new WeightedNode("c");
    WeightedNode d = new WeightedNode("d");
    WeightedNode e = new WeightedNode("e");
    WeightedNode f = new WeightedNode("f");
    WeightedNode g = new WeightedNode("g");
    WeightedNode h = new WeightedNode("h");
    WeightedNode i = new WeightedNode("i");
    WeightedNode j = new WeightedNode("j");
    WeightedNode k = new WeightedNode("k");

    a.setRibbers(Arrays.asList(
        new GraphWeightedRibber(b, 1),
        new GraphWeightedRibber(c, 15),
        new GraphWeightedRibber(d, 1),
        new GraphWeightedRibber(e, 6),
        new GraphWeightedRibber(f, 10)
    ));

    b.setRibbers(Arrays.asList(new GraphWeightedRibber(c, 10)));
    c.setRibbers(Arrays.asList(new GraphWeightedRibber(h, 2)));
    d.setRibbers(Arrays.asList(new GraphWeightedRibber(g, 17), new GraphWeightedRibber(e, 3), new GraphWeightedRibber(f, 4)));
    e.setRibbers(Arrays.asList(new GraphWeightedRibber(i, 4)));
    f.setRibbers(Arrays.asList(new GraphWeightedRibber(i, 3), new GraphWeightedRibber(e, 4)));
    g.setRibbers(Arrays.asList(new GraphWeightedRibber(j, 5)));
    h.setRibbers(Arrays.asList(new GraphWeightedRibber(j, 8)));
    i.setRibbers(Arrays.asList(new GraphWeightedRibber(j, 6)));
    j.setRibbers(Arrays.asList(new GraphWeightedRibber(k, 11)));
    k.setRibbers(Collections.EMPTY_LIST);

    Daykstra daykstra = new Daykstra();
    assertEquals(Arrays.asList(a, d, e, i, j, k), daykstra.findShortestWay(a, k));
  //  assertEquals(null, daykstra.findShortestWay(a, k)); // a - d - e - i - j - k
  }
}