package se.ec.robert;

import java.util.Objects;

abstract class Product {
  int price;
  String name;
  int calories;

  public Product(int price, String name, int calories) {
    this.price = price;
    this.name = name;
    this.calories = calories;
  }

  @Override
  public String toString() {
    return getName() + ", " + getPrice() + " SEK, " + getCalories() + " calories";
  }

  public int getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  public int getCalories() {
    return calories;
  }

  abstract String examine();
  abstract String use();

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Product)) {
      return false;
    }
    Product product = (Product) o;
    return price == product.price &&
        calories == product.calories &&
        name.equals(product.name);
  }
}

