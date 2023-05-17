package tasks.problems.models;

import java.util.Objects;

public class ListNode {
   public int val;
   public ListNode next;

   public ListNode() {
   }

   public ListNode(int val) {
      this.val = val;
   }

   public ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      ListNode listNode = (ListNode) o;
      if (next == null && listNode.next == null) {
         return Objects.equals(val, listNode.val);
      }
      return val == listNode.val && Objects.equals(next, listNode.next);
   }

   @Override
   public String toString() {
      return super.toString();
   }

   @Override
   public int hashCode() {
      return Objects.hash(val, next);
   }
}
