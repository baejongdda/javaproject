
public class shape {
	private int x;
	private int y;

	public int getx() {
		return x;
	}

	public void setx(int x) {
		this.x = x;
	}

	public int gety() {
		return y;
	}

	public void sety(int y) {
		this.y = y;
	}

	void print() {
		System.out.println("x좌표" + x + "y좌표" + y);
	}
}

class Rectangle extends shape {
	private int wid;
	private int hei;

	public int getwid() {
		return wid;
	}

	public void setwid(int wid) {
		this.wid = wid;
	}

	public int gethei() {
		return hei;
	}

	public void sethei(int hei) {
		this.hei = hei;
	}

	double area() {
		return (double) wid * hei;
	}

	void draw() {
		System.out.println("(" + this.getx() + "," + this.gety() + ")위치에" + "가로" + wid + "세로" + hei);
	}
}

class RectangleTest {
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();

		r1.setx(5);
		r1.sety(3);
		r1.setwid(10);
		r1.sethei(20);

		r2.setx(8);
		r2.sety(10);
		r2.setwid(12);
		r2.sethei(10);
		
		r1.print();
		r1.draw();
		
		r2.print();
		r2.draw();
	}
}
class triangle extends shape{
	
	
	
	
	
	
}