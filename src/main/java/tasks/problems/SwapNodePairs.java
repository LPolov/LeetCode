package tasks.problems;

import java.util.Objects;

public class SwapNodePairs {
  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode newHead = swap(head, head.next);
    ListNode currNode = newHead.next.next;

    while (currNode != null) {
      currNode = swap(currNode, currNode.next);
    }
    return newHead;

  }

  private ListNode swap(ListNode node, ListNode next) {

    if(Objects.isNull(node) || Objects.isNull(next)) {
      return null;
    }

    ListNode newNext = new ListNode(node.val, next.next);
    return new ListNode(next.val, newNext);
  }

  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
