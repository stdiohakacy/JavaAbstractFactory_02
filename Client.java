package creational.AbstractFactory._02;

public class Client {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = ProducerFactory.getFactory("SHAPE");
		Shape circle = shapeFactory.getShape("CIRCLE");
		circle.draw();
		
		AbstractFactory colorFactory = ProducerFactory.getFactory("COLOR");
		Color red = colorFactory.getColor("RED");
		red.fill();
	}
}
