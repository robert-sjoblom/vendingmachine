package se.ec.robert;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
  VendingMachine machine;

  public Fruit fruit() {
    return new Fruit(5, "Apple", 10);
  }

  public Product[] products() {
    Product[] vendingMachineStuff = new Product[3];
    vendingMachineStuff[0] = new Soda(2, "Coke", 2);
    vendingMachineStuff[1] = new Candy(2, "UFO", 5);
    vendingMachineStuff[2] = fruit();
    return vendingMachineStuff;
  }

  @Before
  public void setup() {

    this.machine = new VendingMachine(products());
  }

  @Test
  public void addCurrency() {
    machine.addCurrency(500);
    assertEquals(500, machine.getBalance());

    machine.addCurrency(212);
    assertEquals(500, machine.getBalance());
  }

  @Test
  public void request() {
    machine.addCurrency(20);

    assertEquals(fruit(), machine.request(2));
    assertEquals(15, machine.getBalance());
  }

  @Test
  public void endSession() {
    machine.addCurrency(100);
    assertEquals(100, machine.endSession());
    assertEquals(0, machine.getBalance());
  }

  @Test
  public void getDescription() {
    assertEquals("Coke, 2 SEK, 2 calories",
                 machine.getDescription(0));
  }

  @Test
  public void getBalance() {
    assertEquals(0, machine.getBalance());
  }

  @Test
  public void getProducts() {
    String[] result = {
        "0: Coke, 2 SEK, 2 calories",
        "1: UFO, 2 SEK, 5 calories",
        "2: Apple, 5 SEK, 10 calories"
    };
    assertArrayEquals(result, machine.getProducts());
  }
}