package com.company.InitializationCleanup;

/**
 * Created by I337300 on 9/6/2017.
 */
public class Exercise9 {

  private int money;
  private String feeling;
  public Exercise9(int money) {
    this.money=money;
    System.out.println("money= "+money);
  }

  public Exercise9(String feeling) {
    this.feeling = feeling;
    System.out.println("feeling= "+feeling);
  }

  /**
   *除构造器之外,编译器禁止其他任何方法调用构造器
   *使用this调用构造器,必须将构造器调用最开始的位置
   *(所以不能调用两个,第二个已经不是放在最开始的位置)
   */
  public Exercise9(int money, String feeling) {
    this(money);
    //this(feeling);
  }

}
