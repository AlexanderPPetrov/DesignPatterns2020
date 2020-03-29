package decorator;

public abstract class CarDecorator implements Car {

	protected Car decoratedCar;
	
	public CarDecorator(Car decoratedCar) {
		this.decoratedCar = decoratedCar;
	}
	
	@Override
	public void create() {
		// Add functionality to the basic car class
		this.decoratedCar.create();
	}

}
