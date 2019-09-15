package se.ec.robert;

import static org.junit.Assert.*;

import org.junit.Test;

public class SodaTest {
  @Test
  public void examine() {
    Product product = new Soda(10, "Coke", 200);
    assertEquals("Coke, 10 SEK, 200 calories", product.toString());
    assertEquals("Coke, 10 SEK, 200 calories", product.examine());
  }

  @Test
  public void use() {
    Product product = new Soda(10, "Coke", 200);
    assertEquals("You drank Coke, 10 SEK, 200 calories", product.use());
  }
}