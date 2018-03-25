
public class Cube {
	private double side;

	public Cube() {
		side = 5;
	}

	public Cube(double side) {
		this.side = side;
	}

	public double getside() {
		return side;
	}

	public double getVolume() {
		return side * side * side;
	}

}