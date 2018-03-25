

class point{int x; int y;}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test obj=new Test();
obj.sub();
	}

	void sub()
	{
		point p=new point();
		p.x=10;
		p.y=20;
		set(p);
		System.out.println(p.x+","+p.y);
	}
	void set(point p) {
		p.x=30;
		p.y=40;
	}
}
