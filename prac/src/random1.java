import java.util.Scanner;

public class random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.printf("스위치(1~2로):");
		a = s.nextInt();

		if (a != 1) {
			System.out.println("불이 꺼져있다.");
		} else

			switch (a) {
			case 1:
				System.out.println("불이 켜졌다.");
				break;
			}

		System.out.printf("스위치(1~2로):");
		b = s.nextInt();

		switch (b) {
		case 1:
			System.out.println("불이 켜졌다.");
			break;
		case 2:
			System.out.println("불이 꺼졌다.");
			break;

		}

}
}
