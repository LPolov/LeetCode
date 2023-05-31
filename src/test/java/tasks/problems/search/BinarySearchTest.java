package tasks.problems.search;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

  @ParameterizedTest
  @MethodSource("data")
  void search(int[] arr, int el, int res) {
    BinarySearch binarySearch = new BinarySearch();
    assertEquals(res, binarySearch.search(arr, el));
  }

  private static Stream<Arguments> data() {
    return Stream.of(
        Arguments.of(new int[] {-5000, - 4999, -1, 0, 5000, 12345, 55555}, 55555, 6),
        Arguments.of(new int[] {-5000, - 4999, -1, 0, 5000, 12345, 55555}, -2, -1),
        Arguments.of(new int[] {1 ,2 ,3 ,4 ,5, 6, 7}, 1, 0),
        Arguments.of(new int[] {1 ,2 ,3 ,4 ,5, 6, 7}, 3, 2),
        Arguments.of(new int[] {}, 3, -1),
        Arguments.of(Stream.iterate(-5000, x -> ++x).limit(20000).mapToInt(Integer::intValue).toArray(), 2345, 7345),
        Arguments.of(new int[] {1}, 1, 0),
        Arguments.of(new int[] {1}, 2, -1),
        Arguments.of(new int[] {1, 5}, 1, 0),
        Arguments.of(new int[] {1, 5}, 5, 1)
    );
  }
}