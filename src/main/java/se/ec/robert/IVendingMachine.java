package se.ec.robert;

public interface IVendingMachine {
  void addCurrency(int amount); // add money to moneyPool
  Product request(int productNumber); // buy a product
  int endSession(); // returns what's left of moneyPool
  String getDescription(int productNumber); // get description of Product
  int getBalance(); // shows how much money in moneyPool
  String[] getProducts(); // returns all Products names and productNumbers
}
