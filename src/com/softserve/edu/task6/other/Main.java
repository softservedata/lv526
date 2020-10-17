package com.softserve.edu.task6.other;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

class Main {
  public static void fill(ArrayList arr, int from, int to, int size) {
    if (from > to) {
      throw new Error("from must be greater then to");
    }

    for (int i = 0; i < size; i++) {
      arr.add(from + new Random().nextInt(to - from));
    }
  }

  public static void filter(ArrayList arr, Operationable oper) {
    Iterator<Integer> iterator = arr.iterator();

    while (iterator.hasNext()) {
      if (!oper.callback(iterator.next())) {
        iterator.remove();
      }
    }
  }

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList();

    // clear array
    fill(numbers, 1, 50, 10);
    System.out.println(numbers);

    Operationable op = new Operationable() {
      public boolean callback(int val) {
        return val > 20;
      }
    };

    // filtered array
    filter(numbers, op);
    System.out.println(numbers);
  }

  interface Operationable {
    boolean callback(int val);
  }
}
