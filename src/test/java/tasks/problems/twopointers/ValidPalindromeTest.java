package tasks.problems.twopointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

  @ParameterizedTest
  @MethodSource("data")
  void isPalindrome(String str, boolean res) {
    ValidPalindrome validPalindrome = new ValidPalindrome();
    assertEquals(res, validPalindrome.isPalindrome(str));
  }

  private static Stream<Arguments> data() {
    return Stream.of(
        Arguments.of("A man, a plan, a canal: Panama", true),
        Arguments.of("race a car", false),
        Arguments.of("", false)
    );
  }
}