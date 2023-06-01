package tasks.problems.graphs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tasks.problems.models.DefaultGraphNode;
import tasks.problems.models.GraphNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SearchInDeepTest {

  @ParameterizedTest
  @MethodSource("data")
  void findShortestWay(GraphNode graphNode, int steps) {
    SearchInDeep searchInDeep = new SearchInDeep();
    assertEquals(steps, searchInDeep.findShortestWay(graphNode));
  }

  private static Stream<Arguments> data() {
    DefaultGraphNode a = new DefaultGraphNode(1);
    DefaultGraphNode b = new DefaultGraphNode(2);
    DefaultGraphNode c = new DefaultGraphNode(3);
    DefaultGraphNode d = new DefaultGraphNode(4);
    DefaultGraphNode e = new DefaultGraphNode(5);
    DefaultGraphNode f = new DefaultGraphNode(6);
    DefaultGraphNode g = new DefaultGraphNode(7);

    a.setChildren(Arrays.asList(b, c, d));
    b.setChildren(Arrays.asList(c, e));
    c.setChildren(Arrays.asList(e));
    d.setChildren(Arrays.asList(f));
    e.setChildren(Arrays.asList(g));
    f.setChildren(Arrays.asList(g));
    g.setChildren(Collections.EMPTY_LIST);


    DefaultGraphNode aa = new DefaultGraphNode(1);
    DefaultGraphNode bb = new DefaultGraphNode(2);
    DefaultGraphNode cc = new DefaultGraphNode(3);
    DefaultGraphNode dd = new DefaultGraphNode(4);
    DefaultGraphNode ee = new DefaultGraphNode(5);
    DefaultGraphNode ff = new DefaultGraphNode(6);

    aa.setChildren(Arrays.asList(bb, cc, dd));
    bb.setChildren(Arrays.asList(cc, ee));
    cc.setChildren(Arrays.asList(dd, ff));
    dd.setChildren(Arrays.asList(ff));
    ee.setChildren(Arrays.asList(ff));
    ff.setChildren(Collections.EMPTY_LIST);

    return Stream.of(
        Arguments.of(a, 3),
        Arguments.of(aa, 2)
    );
  }
}