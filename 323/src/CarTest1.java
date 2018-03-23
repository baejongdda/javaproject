
class Car {

	private String model;

	private String color;

	private int speed;

	// �ڵ����� �ø��� ��ȣ

	private int id;

	// ��üȭ�� Car ��ü�� ������ ���� ���� ����

	private static int numbers = 0;

	public Car(String m, String c, int s) {

		model = m;

		color = c;

		speed = s;

		// �ڵ����� ������ �����ϰ� id�� �����Ѵ�.

		id = ++numbers;

	}

	// ���� �޼ҵ�

	public static int getNumberOfCars() {

		return numbers; // OK!

	}

}

public class CarTest1 {

	public static void main(String args[]) {

		Car c1 = new Car("S600", "white", 80); // ù ��° ������ ȣ��

		Car c2 = new Car("E500", "blue", 20); // ù ��° ������ ȣ��

		int n = Car.getNumberOfCars(); // ���� �޼ҵ� ȣ��

		System.out.println("���ݱ��� ������ �ڵ��� �� = " + n);

	}

}