package creational.AbstractFactory._02;

public class ColorFactory implements AbstractFactory{
	public Color getColor(String colorType) {
		switch (colorType) {
		case "RED":
			return new Red();
		case "BLUE":
			return new Blue();
		case "YELLOW":
			return new Yellow();
		default:
			return null;
		}
	}

	@Override
	public Shape getShape(String type) {
		return null;
	}
}
