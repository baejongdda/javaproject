class car {
	int speed;

	public void setspeed(int speed) {
		this.speed = speed;
		System.out.println("�ӵ���" + speed);
	}
}

class truck extends car {

}

class bus extends car {

	boolean door;

	public void setdoor(boolean opcl) {
		door = opcl;
	}
}

class sportsCar extends car {

	boolean turbo;

	public void setturbo(boolean flag) {
		turbo = flag;
		System.out.println("�ͺ���" + turbo);
	}
}

public class CarTest {
	public static void main(String[] args) {
		sportsCar C = new sportsCar();
		C.speed = 10;
		C.setspeed(50);
		C.setturbo(true);

	}
}