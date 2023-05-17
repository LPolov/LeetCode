package tasks.problems.list;

import tasks.problems.models.ListNode;

import java.util.Stack;

public class SumTwoNumbers {

   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode result = new ListNode();
      int sum = l1.val + l2.val;
      int ost = sum / 10;
      result.val = sum % 10;

      l1 = l1.next;
      l2 = l2.next;

      if (l1 == null && l2 == null) {
         if (sum >= 10) {
            result.next = new ListNode(ost);
         }
         return result;
      }

      ListNode next;
      ListNode prev = result;
      int l1Val;
      int l2Val;

      while (true) {
         l1Val = l1 == null ? 0 : l1.val;
         l2Val = l2 == null ? 0 : l2.val;

         sum = l1Val + l2Val + ost;
         ost = sum / 10;

         next = new ListNode(sum % 10);
         prev.next = next;
         prev = next;

         l1 = l1 == null ? null : l1.next;
         l2 = l2 == null ? null : l2.next;

         if (l1 == null && l2 == null) {
            if (sum >= 10) {
               next.next = new ListNode(ost);
            }
            break;
         }
      }
      return result;
   }
}
