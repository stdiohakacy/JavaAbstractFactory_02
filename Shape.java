package creational.AbstractFactory._02;

public interface Shape {
	public void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle drawing .... ");
	}

}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square drawing .... ");
	}

}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle drawing .... ");
	}

}