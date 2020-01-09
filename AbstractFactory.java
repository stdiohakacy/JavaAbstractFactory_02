package creational.AbstractFactory._02;

public interface AbstractFactory {
	public Shape getShape(String type);
	public Color getColor(String type);
}
