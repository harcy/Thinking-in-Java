package com.company.InitializationCleanup;

/**
 * Created by I337300 on 9/7/2017.
 */
public class Table {
  static Bowl bowl1 = new Bowl(1);

  public Table() {
    System.out.println("Table()");
    bowl2.f1(1);
  }

  void f2(int marker) {
    System.out.println("f2(" + marker + ")");
  }

  static Bowl bowl2 = new Bowl(2);

}
