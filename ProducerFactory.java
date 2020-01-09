package creational.AbstractFactory._02;

public class ProducerFactory {
	public static AbstractFactory getFactory(String choice) {
		switch (choice) {
		case "SHAPE":
			return new ShapeFactory();

		case "COLOR":
			return new ColorFactory();
		default:
			return null;
		}
	}
}
