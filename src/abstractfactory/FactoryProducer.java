package abstractfactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String factory) {
		
		if(factory.equals("COLOR")) {
			return new ColorFactory();
		}
		if(factory.equals("SHAPE")) {
			return new ShapeFactory();
		}
		
		System.out.println("Unknown factory type");
		return null;
	}
}
