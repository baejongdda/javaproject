import java.util.Scanner;

class Circles {
	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public int getCir() {
		return Cir;
	}

	public void setCir(int cir) {
		Cir = cir;
	}

	String circle;
	int Cir = 10;
}

public class CirclesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select = 10;

		String[] circles = { "영화 감상부", "독서부", "도서부", "드론부", "3d프린터 부" };
		Scanner s = new Scanner(System.in);
		Circles Cc = new Circles();
		for (int i = 0; i < circles.length; i++) {
			String a = circles[i];
			System.out.println(i + 1+"." + a);
		}
		while (select != 6) {

			System.out.println("가입 하시고자 하는 동아리를 선택하시오:");
			System.out.println("종료는 6번");
			select = s.nextInt();
			switch (select) {
			case 1:

				System.out.println("영화 감상부 가입되었습니다");
				// Cc.Cir=--;
				break;
			case 2:
				System.out.println("독서부 가입되었습니다");
				break;
			case 3:
				System.out.println("도서부 가입되었습니다");
				break;
			case 4:
				System.out.println("드론부 가입되었습니다");
				break;
			case 5:
				System.out.println("3d프린터부 가입되었습니다");
				break;
			case 6:
				System.out.println("종료");
				break;
			}
		}

	}
}