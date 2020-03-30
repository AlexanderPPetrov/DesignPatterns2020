package strategy;

public class StrategyMain {

	public static void main(String[] args) {

		ShoppingCart shoppingCart = new ShoppingCart();
		Item product1 = new Item("38393", 5);
		Item product2 = new Item("12302", 10);
		
		shoppingCart.addItem(product1);
		shoppingCart.addItem(product2);
		
		shoppingCart.pay(new PaypalStrategy("ivan.ivanov@gmail.com", "123"));
		shoppingCart.pay(new CreditCardStrategy("IVAN IVANOV", "3234 2334 2344 3433", "10/25", "400"));
	}

}
