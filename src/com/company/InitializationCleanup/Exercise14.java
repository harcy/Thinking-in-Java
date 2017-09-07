package com.company.InitializationCleanup;

/**
 * Created by I337300 on 9/7/2017.
 */
public class Exercise14 {
  private static String oneField = "OneField";
  private static String twoField;
  static {
    twoField = "Two";
  }

  public static void main(String[] args) {
    System.out.println(Exercise14.oneField);
    System.out.println(Exercise14.twoField);
  }
}
