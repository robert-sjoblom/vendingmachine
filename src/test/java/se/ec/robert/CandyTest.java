package se.ec.robert;

import static org.junit.Assert.*;

import org.junit.Test;

public class CandyTest {

  @Test
  public void examine() {
    Product product = new Candy(200, "Raider bar", 5);
    assertEquals("Raider bar, 200 SEK, 5 calories", product.toString());
    assertEquals("Raider bar, 200 SEK, 5 calories", product.examine());
  }

  @Test
  public void use() {
    Product product = new Fruit(200, "Raider bar", 5);
    assertEquals("You ate Raider bar, 200 SEK, 5 calories", product.use());
  }
}