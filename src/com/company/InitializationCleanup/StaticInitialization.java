package com.company.InitializationCleanup;

/**
 * Created by I337300 on 9/7/2017.
 * static变量最先初始化,并且只会初始化一次,以后new对象时static变量不会再初始化,
 * 然后是成员变量的初始化,紧接着是构造器的初始化
 * static成员变量和非static成员变量无论在什么位置都是最先进行初始化的
 */
public class StaticInitialization {
  public static void main(String[] args) {
    System.out.println("Creating new Cupboard() in main");
    new Cupboard();
    System.out.println("Creating new Cupboard() in main");
    new Cupboard();
    table.f2(1);
    cupboard.f3(1);
}

  static Table table = new Table();
  static Cupboard cupboard = new Cupboard();
}

