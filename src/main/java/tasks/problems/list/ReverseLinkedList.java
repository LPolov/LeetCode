package tasks.problems.list;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

  public List<Integer> reverse(LinkedList<Integer> list) {
    LinkedList<Integer> result = new LinkedList<>();

    while (!list.isEmpty()) {
      result.add(list.pollLast());
    }
    return result;
  }
}
