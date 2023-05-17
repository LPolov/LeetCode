package tasks.problems.list;

import tasks.problems.models.ListNode;

import java.util.Objects;

public class SwapNodePairs {

  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    swap(head, head.next);
    ListNode currNode = head.next.next;

    while (currNode != null && currNode.next != null) {
      swap(currNode, currNode.next);
      currNode = currNode.next.next == null ? null : currNode.next.next;
    }
    return head;

  }

  public void swap(ListNode node, ListNode next) {
     int nodeVal = node.val;
     node.val = next.val;
     next.val = nodeVal;
  }

}
