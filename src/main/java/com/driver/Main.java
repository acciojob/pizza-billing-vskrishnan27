package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);
    // 300
    p.addExtraCheese();
    // 80
    p.addExtraToppings();
    // 70
    p.addTakeaway();
    // 20
    System.out.println(p.getBill());
  }
}