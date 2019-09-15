package se.ec.robert;

import static org.junit.Assert.*;

import org.junit.Test;

public class FruitTest {
  @Test
  public void examine() {
    Product product = new Candy(5, "Apple", 15);
    assertEquals("Apple, 5 SEK, 15 calories", product.examine());
  }

  @Test
  public void use() {
    Product product = new Fruit(5, "Apple", 15);
    assertEquals("You ate Apple, 5 SEK, 15 calories", product.use());
  }
}