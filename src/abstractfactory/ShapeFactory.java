package abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// Shape factory does not have getColor implementation
		return null;
	}

	@Override
	Shape getShape(String shape) {

		if(shape.equals("CIRCLE")) {
			return new Circle();
		}
		
		if(shape.equals("RECTANGLE")) {
			return new Rectangle();
		}
		
		System.out.println("Unknown shape type");
		return null;
	}

}
