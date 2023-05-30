package tasks.problems.sets;

import java.util.Arrays;

public class MyHashSetArr {

  boolean[] data = new boolean[1000000];

  public MyHashSetArr() {
  }

  public void add(int key) {
    data[key] = true;
  }

  public void remove(int key) {
   data[key] = false;
  }

  public boolean contains(int key) {
   return data[key];
  }
}
