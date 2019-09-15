package se.ec.robert;

import java.util.Arrays;

public class VendingMachine implements IVendingMachine {
  private Product[] products;
  private int moneyPool = 0;
  private int[] acceptedCurrencyValues = { 1, 5, 10, 20, 50, 100, 500, 1000 };

  public VendingMachine(Product[] products) {
    this.products = products;
  }

  @Override
  public void addCurrency(int amount) {
    if (validCurrency(amount)) moneyPool += amount;
  }

  @Override
  public Product request(int productNumber) {
    Product requestedProduct = products[productNumber];

    // ordinarily I'd throw an exception here, but I don't know them well enough
    if (requestedProduct.getPrice() <= moneyPool){
      moneyPool -= requestedProduct.getPrice();
      return requestedProduct;
    }
    return null;
  }

  @Override
  public int endSession() {
    int moneyLeft = moneyPool;
    moneyPool = 0;

    return moneyLeft;
  }

  @Override
  public String getDescription(int productNumber) {
    return products[productNumber].toString();
  }

  @Override
  public int getBalance() {
    return moneyPool;
  }

  @Override
  public String[] getProducts() {
    String[] productList = new String[products.length];
    for (int i = 0; i < products.length; i++) {
      String product = String.format("%d: %s", i, products[i]);
      productList[i] = product;
    }
    return productList;
  }

  private boolean validCurrency(int amount) {
    for (int i = 0; i < acceptedCurrencyValues.length; i++) {
      if (acceptedCurrencyValues[i] == amount) return true;
    }
    return false;
  }
}
