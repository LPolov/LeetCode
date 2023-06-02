package tasks.problems.sort;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class InsertSortTest {

  @ParameterizedTest
  @MethodSource("data")
  void sort(int[] arr, int[] res) {
    new InsertSort().sort(arr);
    assertArrayEquals(res, arr);
  }

  @Test
  void bigDataTest() {
    List<Integer> collect = Stream.iterate(-15000, x -> ++x).limit(20000).collect(Collectors.toList());
    int[] res = collect.stream().mapToInt(Integer::intValue).toArray();
    Collections.shuffle(collect);
    int[] arr = collect.stream().mapToInt(Integer::intValue).toArray();
    new InsertSort().sort(arr);
    assertArrayEquals(res, arr);
  }

  private static Stream<Arguments> data() {
    return Stream.of(
        Arguments.of(new int[] {}, new int[] {}),
        Arguments.of(new int[] {1}, new int[] {1}),
        Arguments.of(new int[] {55555, 12345, 5000, 0, -1, -4999, -5000}, new int[] {-5000, - 4999, -1, 0, 5000, 12345, 55555}),
        Arguments.of(new int[] {1 ,2 ,3 ,4 ,5, 6, 7}, new int[] {1 ,2 ,3 ,4 ,5, 6, 7}),
        Arguments.of(new int[] {5 ,5, 5, 5, 5}, new int[] {5 ,5, 5, 5, 5}),
        Arguments.of(Stream.iterate(5000, x -> --x).limit(20000).mapToInt(Integer::intValue).toArray(), Stream.iterate(-14999, x -> ++x).limit(20000).mapToInt(Integer::intValue).toArray())
    );
  }
}