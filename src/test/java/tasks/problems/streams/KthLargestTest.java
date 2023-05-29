package tasks.problems.streams;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestTest {

  @ParameterizedTest
  @MethodSource("data")
  void add(int k, int[] nums, List<Integer> operations, List<Integer> res) {
    KthLargest kthLargest = new KthLargest(k, nums);
    for (int i = 0; i < operations.size(); i ++) {
      assertEquals(res.get(i), kthLargest.add(operations.get(i)));
    }
  }

  private static Stream<Arguments> data() {
    return Stream.of(
        Arguments.of(3, new int[] {4, 5, 8, 2}, Arrays.asList(3, 5, 10, 9, 4), Arrays.asList( 4, 5, 5, 8, 8)),
        Arguments.of(1, new int[0], Arrays.asList(-3, -2, -4, 0, 4), Arrays.asList( -3, -2, -2, 0, 4)),
        Arguments.of(2, new int[0], Arrays.asList(-1, 1, -2, -4, 3), Arrays.asList( -1, 0, 0, 0, 1))
    );
  }
}