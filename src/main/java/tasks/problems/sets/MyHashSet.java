package tasks.problems.sets;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

public class MyHashSet {

  Node[] data = new Node[16];
  int elNum = 0;
  public MyHashSet() {
  }

  public MyHashSet(Collection<Integer> data) {
    data.forEach(this::add);
  }

  private void ensureCapacity() {
    if (elNum > data.length * 0.75f) {
      Node[] dataCopy = new Node[data.length];
      System.arraycopy(data, 0, dataCopy, 0, data.length);
      data = new Node[data.length * 3 / 2 + 1];
      Arrays.stream(dataCopy)
          .map(x -> x.val)
          .forEach(this::add);
    }
  }

  public void add(int key) {
    ensureCapacity();

    Node node = new Node(key);
    int ind = (data.length - 1) & key;

    if (data[ind] == null) {
      data[ind] = node;
      return;
    }

    Node curr = data[ind];
    while (curr.hasNext()) {
      curr = curr.next;
    }
    curr.next = node;
    elNum++;
  }

  public void remove(int key) {
    int ind = (data.length - 1) & key;

    if (data[ind] == null) {
      return;
    }

    Node curr = data[ind];

    if (curr.val == key) {
      data[ind] = null;
      elNum--;
      return;
    }

    while (curr.hasNext() && curr.next.val != key) {
      curr = curr.next;
    }

    curr.next = null;
    elNum--;
  }

  public boolean contains(int key) {
    int ind = (data.length - 1) & key;
    Node curr = data[ind];

    while (curr != null) {
      if (curr.val == key) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

  private static class Node {
    private int val;
    private Node next;

    private Node (int val) {
      this.val = val;
    }

    public boolean hasNext() {
      return next != null;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }

      if (o == null || !(o instanceof Node)) {
        return false;
      }

      Node node = (Node) o;
      return ((Node) o).val == this.val;
    }

    @Override
    public int hashCode() {
      return val;
    }
  }
}
