package strategy;

public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;
	private String expirationDate;
	private String cvv;
	
	public CreditCardStrategy(String name, String cardNumber, String expirationDate, String cvv) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.cvv = cvv;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Credit Card payment: " + amount);
	}

}
