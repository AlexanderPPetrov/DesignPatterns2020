package factorymethod;

public class MilkFactory extends FarmFactory {

	@Override
	public FarmProduct createProduct(String name) {
		
		FarmProduct product = null;
		
		if(name.equals("COW_MILK")) {
			product = new CowMilk(); 
			product.setPrice(1.50);
		}
		
		if(name.equals("GOAT_MILK")) {
			product = new GoatMilk();
			product.setPrice(1.80);
		}
		
		return product;
	}

}
