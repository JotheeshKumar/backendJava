package fullstackdev.development.areacalculate;

public class Rectangle extends Shape {

	
	double length;
    double breadth;
	

    Rectangle(int length, int breadth)
    { super("Rectangle");
        this.length = length;
        this.breadth = breadth;
    }

    
	public double getLength() {
		return length;
	}


	public double getBreadth() {
		return breadth;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}


	double calculateArea() {
		return (double) length * breadth;
	}

}
