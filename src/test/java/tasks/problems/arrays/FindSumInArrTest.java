package tasks.problems.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindSumInArrTest {

  @ParameterizedTest
  @MethodSource("data")
  void exists(int[] arr, int s, boolean res) {
    FindSumInArr findSumInArr = new FindSumInArr();
    assertEquals(res, findSumInArr.exists(arr, s));
  }

  private static Stream<Arguments> data() {
    return Stream.of(
        Arguments.of(new int[] {0, 1, 2, 2, 3, 34}, 5, true),
        Arguments.of(new int[] {1, 2, 2, 3, 34}, 4, true),
        Arguments.of(new int[] {1, 2, 3, 34}, 423, false),
        Arguments.of(new int[] {}, 4, false)
    );
  }
}