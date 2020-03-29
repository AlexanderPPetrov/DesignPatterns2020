package abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		
		if(color.equals("BLUE")) {
			return new Blue();
		}
		
		if(color.equals("RED")) {
			return new Red();
		}
		
		// Unknown color type
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// Color factory does not have getShape implementation
		return null;
	}

}
