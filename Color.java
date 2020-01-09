package creational.AbstractFactory._02;

public interface Color {
	public void fill();
}

class Red implements Color {

	@Override
	public void fill() {
		System.out.println("red filling... ");
	}

}

class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Blue filling... ");
	}

}

class Yellow implements Color {

	@Override
	public void fill() {
		System.out.println("Yellow filling... ");
	}

}