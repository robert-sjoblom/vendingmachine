package se.ec.robert;

public class Fruit extends Product {
  public Fruit(int price, String name, int calories) {
    super(price, name, calories);
  }

  @Override
  String examine() {
    return this.toString();
  }

  @Override
  String use() {
    return String.format("You ate %s", this.toString());
  }
}
