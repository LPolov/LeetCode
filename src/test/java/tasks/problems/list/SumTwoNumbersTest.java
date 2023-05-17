package tasks.problems.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tasks.problems.models.ListNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumTwoNumbersTest {

   @ParameterizedTest
   @MethodSource("params")
   void addTwoNumbers(ListNode l1, ListNode l2, ListNode res) {
      SumTwoNumbers sum = new SumTwoNumbers();
      Assertions.assertEquals(res, sum.addTwoNumbers(l1, l2));
   }

   private static Stream<Arguments> params() {
      return Stream.of(
//          Arguments.of(
//              new ListNode(2, new ListNode(4, new ListNode(3))),
//              new ListNode(5, new ListNode(6, new ListNode(4))),
//              new ListNode(7, new ListNode(0, new ListNode(8)))
//          ),
//          Arguments.of(
//              new ListNode(0),
//              new ListNode(0),
//              new ListNode(0)
//          ),
//          Arguments.of(
//              new ListNode(0),
//              new ListNode(9),
//              new ListNode(9)
//          ),
//          Arguments.of(
//              new ListNode(7, new ListNode(8, new ListNode(9))),
//              new ListNode(0, new ListNode(6, new ListNode(4))),
//              new ListNode(7, new ListNode(4, new ListNode(4, new ListNode(1))))
//          )
//          ,
          Arguments.of(
              new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))),
              new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))),
              new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))))
          )
      );
   }
}