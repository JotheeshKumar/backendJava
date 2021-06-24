package fullstackdev.development.areacalculate;

public class Square extends Shape {

	int side = 0;

	public Square(int side) {
		super("Square");
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	double calculateArea() {
		return side * side;
	}

}
