package se.ec.robert;

public class Candy extends Product {
  public Candy(int price, String name, int calories) {
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
