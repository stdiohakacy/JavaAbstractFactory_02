package creational.AbstractFactory._02;

public class ShapeFactory implements AbstractFactory{
	public Shape getShape(String shapeType) {
		switch (shapeType) {
		case "RECTANGLE":
			return new Rectangle();
		case "SQUARE":
			return new Square();
		case "CIRCLE":
			return new Circle();
		default:
			return null;
		}
	}

	@Override
	public Color getColor(String type) {
		return null;
	}
}
