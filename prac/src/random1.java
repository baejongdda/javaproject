import java.util.Scanner;

public class random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.printf("����ġ(1~2��):");
		a = s.nextInt();

		if (a != 1) {
			System.out.println("���� �����ִ�.");
		} else

			switch (a) {
			case 1:
				System.out.println("���� ������.");
				break;
			}

		System.out.printf("����ġ(1~2��):");
		b = s.nextInt();

		switch (b) {
		case 1:
			System.out.println("���� ������.");
			break;
		case 2:
			System.out.println("���� ������.");
			break;

		}

}
}
