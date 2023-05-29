package tasks.problems.another;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ParkingSystemTest {

  private ParkingSystem parkingSystem;

  @BeforeEach
  void setUp() {

  }

  @ParameterizedTest
  @MethodSource("data")
  void addCar(int big, int medium, int small, List<Integer> ops, List<Boolean> res) {
    ParkingSystem parkingSystem = new ParkingSystem(big, medium, small);
    for(int i = 0; i < ops.size(); i++) {
      assertEquals(res.get(i), parkingSystem.addCar(ops.get(i)));
    }
  }

  private static Stream<Arguments> data() {
    return Stream.of(
        Arguments.of(1, 1, 0, Arrays.asList(1, 2, 3, 1), Arrays.asList(true, true, false, false)),
        Arguments.of(0, 0, 0, Arrays.asList(1, 2, 3, 1), Arrays.asList(false, false, false, false)),
        Arguments.of(2, 2, 2, Arrays.asList(1, 2, 3, 1), Arrays.asList(true, true, true, true)),
        Arguments.of(2, 2, 2, Arrays.asList(1, 1, 1, 1), Arrays.asList(true, true, false, false))
    );
  }
}