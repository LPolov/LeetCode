package tasks.problems.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

   @ParameterizedTest
   @MethodSource("data")
   void topKFrequent(int[] arr, int k, int[] res) {
      TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
      int[] ints = topKFrequentElements.topKFrequent(arr, k);
      Arrays.sort(res);
      Arrays.sort(ints);
      assertArrayEquals(res, ints);
   }

   private static Stream<Arguments> data() {
      return Stream.of(
          Arguments.of(new int[]{1, 1, 1, 2, 2, 3}, 2, new int[]{1, 2}),
          Arguments.of(new int[]{1, 1, 2, 2, 2, 3}, 2, new int[]{1, 2}),
          Arguments.of(new int[]{1, 1, 2, 3, 2, 2, 3, 3, 3}, 2, new int[]{3, 2}),
          Arguments.of(new int[]{4, 1, 1, 2, 3, 2, 2, 3, 3, 3, 4, 4, 4, 4}, 3, new int[]{3, 4, 2}),
          Arguments.of(new int[]{1, 1, 2, 3, 2, 2, 3, 3, 3}, 1, new int[]{3})
          );
   }

}