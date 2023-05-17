package tasks.problems.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tasks.problems.models.ListNode;

import java.util.stream.Stream;

class SwapNodePairsTest {

   @Timeout(value = 1)
   @ParameterizedTest
   @MethodSource("params")
   void swapPairs(ListNode node, ListNode expected) {

      System.out.println((int)'1');
      SwapNodePairs swapNodePairs = new SwapNodePairs();
      Assertions.assertEquals(swapNodePairs.swapPairs(node), expected);
   }

   static Stream<Arguments> params() {
      return Stream.of(
          Arguments.of(
              new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))),
              new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3))))
          ),
          Arguments.of(
              new ListNode(1, new ListNode(2, new ListNode(3))),
              new ListNode(2, new ListNode(1, new ListNode(3)))
          ),
          Arguments.of(
              new ListNode(10),
              new ListNode(10)
          ),
          Arguments.of(
              new ListNode(),
              new ListNode()
          )
      );
   }
}