package se.ec.robert;

public class Soda extends Product {
  public Soda(int price, String name, int calories) {
    super(price, name, calories);
  }

  @Override
  public String examine() {
    return this.toString();
  }

  @Override
  public String use() {
    return String.format("You drank %s", this.toString());
  }
}
