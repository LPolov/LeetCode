package tasks.problems.strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SubstrWithoutReapitingCharsTest {

  @ParameterizedTest
  @MethodSource
  void lengthOfLongestSubstring(String str, int res) {
    SubstrWithoutReapitingChars substrWithoutReapitingChars = new SubstrWithoutReapitingChars();
    assertEquals(res, substrWithoutReapitingChars.lengthOfLongestSubstring(str));
  }

  private static Stream<Arguments> lengthOfLongestSubstring() {
    return Stream.of(
        Arguments.of("abcabcbb", 3),
        Arguments.of("bbbbb", 1),
        Arguments.of("pwwkew", 3),
        Arguments.of("aaabcdedftss", 5),
        Arguments.of("dvdf", 3),
        Arguments.of("abba", 2)
    );
  }
}