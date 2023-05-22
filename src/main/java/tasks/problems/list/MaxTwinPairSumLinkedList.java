package tasks.problems.list;

import tasks.problems.models.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MaxTwinPairSumLinkedList {

  public int pairSum(ListNode head) {
    List<Integer> vals = new ArrayList<>();
    ListNode currNode = head;

    while (currNode != null) {
      vals.add(currNode.val);
      currNode = currNode.next;
    }

    int size = vals.size();
    int middle = size / 2 - 1;
    int maxSum = 0;
    int currSum = 0;

    for (int i = 0; i <= middle; i++) {
      currSum = vals.get(i) + vals.get(size - 1 - i);
      if (maxSum < currSum) {
        maxSum = currSum;
      }
    }
    return maxSum;
  }

  public int pairSums(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    ListNode next;
    ListNode prev = null;

    while (slow != null) {
      next = slow.next;
      slow.next = prev;
      prev = slow;
      slow = next;
    }

    int maxSum = 0;

    while (prev != null) {
      if (maxSum < head.val + prev.val) {
        maxSum = head.val + prev.val;
      }
      head = head.next;
      prev = prev.next;
    }

    return maxSum;
  }
}
