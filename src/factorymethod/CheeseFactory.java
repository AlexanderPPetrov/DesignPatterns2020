package factorymethod;

public class CheeseFactory extends FarmFactory {

	@Override
	public FarmProduct createProduct(String name) {
		
		FarmProduct product = null;
		
		if(name.equals("COW_CHEESE")) {
			product = new CowCheese(); 
			product.setPrice(2.50);
		}
		
		if(name.equals("GOAT_CHEESE")) {
			product = new GoatCheese();
			product.setPrice(2.80);
		}
		
		return product;
	}

}
