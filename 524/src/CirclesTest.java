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

		String[] circles = { "��ȭ �����", "������", "������", "��к�", "3d������ ��" };
		Scanner s = new Scanner(System.in);
		Circles Cc = new Circles();
		for (int i = 0; i < circles.length; i++) {
			String a = circles[i];
			System.out.println(i + 1+"." + a);
		}
		while (select != 6) {

			System.out.println("���� �Ͻð��� �ϴ� ���Ƹ��� �����Ͻÿ�:");
			System.out.println("����� 6��");
			select = s.nextInt();
			switch (select) {
			case 1:

				System.out.println("��ȭ ����� ���ԵǾ����ϴ�");
				// Cc.Cir=--;
				break;
			case 2:
				System.out.println("������ ���ԵǾ����ϴ�");
				break;
			case 3:
				System.out.println("������ ���ԵǾ����ϴ�");
				break;
			case 4:
				System.out.println("��к� ���ԵǾ����ϴ�");
				break;
			case 5:
				System.out.println("3d�����ͺ� ���ԵǾ����ϴ�");
				break;
			case 6:
				System.out.println("����");
				break;
			}
		}

	}
}