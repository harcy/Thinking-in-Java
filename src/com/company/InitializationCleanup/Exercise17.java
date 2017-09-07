package com.company.InitializationCleanup;

/**
 * Created by I337300 on 9/7/2017.
 */
public class Exercise17 {
  private String field;

  public Exercise17(String field) {
    this.field = field;
    System.out.println(this.field);
  }

  public static void main(String[] args) {
    Exercise17[] ex = new Exercise17[10];
    for (int i=0;i<2;i++) {
      ex[i] = new Exercise17(String.valueOf(i));
    }
  }
}
