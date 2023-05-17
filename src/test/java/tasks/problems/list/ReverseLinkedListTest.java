package tasks.problems.list;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

  @ParameterizedTest
  @MethodSource("params")
  void reverse(LinkedList<Integer> list, LinkedList<Integer> result) {
    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
    assertEquals(result, reverseLinkedList.reverse(list));
  }

  private static Stream<Arguments> params() {
    return Stream.of(
        Arguments.of(
            new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)),
            new LinkedList<>(Arrays.asList(8, 7, 6, 5, 4, 3, 2, 1))
        ),
        Arguments.of(
            new LinkedList<>(Arrays.asList(1)),
            new LinkedList<>(Arrays.asList(1))
        ),
        Arguments.of(
            new LinkedList<>(),
            new LinkedList<>()
        )
    );
  }
}