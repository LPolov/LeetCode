package tasks.problems.sets;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MyHashSetTest {

  @ParameterizedTest
  @MethodSource("addData")
  void add(List<Integer> data, Set<Integer> res) {
    MyHashSetArr myHashSet = new MyHashSetArr();

    for (Integer i : data) {
      myHashSet.add(i);
    }
    assertTrue(myHashSet.equals(res));
  }

  @ParameterizedTest
  @MethodSource("removeData")
  void remove(MyHashSet myHashSet, List<Integer> data, Set<Integer> res) {
    for (Integer i : data) {
      myHashSet.remove(i);
    }
    assertEquals(res, myHashSet);
  }

  @ParameterizedTest
  @MethodSource("containsData")
  void contains(MyHashSet myHashSet, List<Integer> data, List<Boolean> res) {
    for (int i = 0; i < data.size(); i++) {
      assertEquals(res.get(i), myHashSet.contains(data.get(i)));
    }
  }

  private static Stream<Arguments> addData() {
    return Stream.of(
        Arguments.of(Arrays.asList(1, 2, 3, 4, 5), new HashSet<>(Arrays.asList(1, 2, 3, 4, 5))),
        Arguments.of(Arrays.asList(1, 2, null, 4, 5), new HashSet<>(Arrays.asList(1, 2, 4, 5))),
        Arguments.of(Collections.EMPTY_LIST, Collections.EMPTY_SET)
    );
  }

  private static Stream<Arguments> removeData() {
    return Stream.of(
        Arguments.of(new MyHashSet(Arrays.asList(1, 2, 3, 4, 5)), Arrays.asList(1), new HashSet<>(Arrays.asList(2, 3, 4, 5))),
        Arguments.of(new MyHashSet(Arrays.asList(1, 2, 3, 4, 5)), Arrays.asList(1, 2, 3, 4, 5), new HashSet<>()),
        Arguments.of(new MyHashSet(Arrays.asList(1, 2, 3, 4, 5)), Arrays.asList(6), new HashSet<>(Arrays.asList(1, 2, 3, 4, 5))),
        Arguments.of(new MyHashSet(), Arrays.asList(6), new HashSet<>())
    );
  }

  private static Stream<Arguments> containsData() {
    return Stream.of(
        Arguments.of(new MyHashSet(Arrays.asList(1, 2, 3, 4, 5)), Arrays.asList(1), Arrays.asList(true)),
        Arguments.of(new MyHashSet(Arrays.asList(1, 2, 3, 4, 5)), Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(true, true, true, true, true)),
        Arguments.of(new MyHashSet(Arrays.asList(1, 2, 3, 4, 5)), Arrays.asList(1, -2, 3, -4, 5), Arrays.asList(true, false, true, false, true)),
        Arguments.of(new MyHashSet(), Arrays.asList(1, -2, 3, -4, 5), Arrays.asList(false, false, false, false, false))
    );
  }
}