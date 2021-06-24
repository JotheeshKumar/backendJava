package fullstackdev.development.areacalculate;

abstract class Shape {
	protected String shapeName;
	

	public Shape(String shapeName) {
		super();
		this.shapeName = shapeName;
	}

	double calculateArea() {
		return 0;
	}

	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

}
