package tasks.problems.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubsequenceScoreTest {

  @ParameterizedTest
  @MethodSource("data")
  void maxScore(int[] num1, int[] num2, int k, int res) {
    MaxSubsequenceScore maxSubsequenceScore = new MaxSubsequenceScore();
    assertEquals(res, maxSubsequenceScore.maxScore(num1, num2, k));
  }

  private static Stream<Arguments> data() {
    return Stream.of(
        Arguments.of(new int[] {1, 3, 3, 2}, new int[] {2, 1, 3, 4}, 3, 12),
        Arguments.of(new int[] {4, 2, 3, 1, 1}, new int[] {7, 5, 10, 9, 6}, 1, 30),
        Arguments.of(new int[] {}, new int[] {}, 0, 0),
        Arguments.of(new int[] {1}, new int[] {1}, 1, 1),
        Arguments.of(new int[] {-1, 2, 3}, new int[] {-1, 1, 1}, 2, -2)
    );
  }
}