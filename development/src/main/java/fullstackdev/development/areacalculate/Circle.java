package fullstackdev.development.areacalculate;

public class Circle extends Shape {

	int radius;

	public Circle(int radius) {
		super("Circle");
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	double calculateArea() {
		return (22.0 / 7.0) * radius * radius;
	}

}
