import java.util.Scanner;

class Score {
	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	int score[] = new int[5];
	String name;
}

public class ottTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Score Sc = new Score();
		int num = 3;
		int number = 1;
		int[] rank = new int[3];
		int[] score = new int[3];
		int stu = 1;
		for (int i = 0; i < num; i++) {
			System.out.println(number + "��° �л� ���� ������ �Է��Ͻÿ�");
			Sc.score[0] = s.nextInt();
			System.out.println(number + "��° �л� ���� ������ �Է��Ͻÿ�");
			Sc.score[1] = s.nextInt();
			System.out.println(number + "��° �л� ���� ������ �Է��Ͻÿ�");
			Sc.score[2] = s.nextInt();
			System.out.println(number + "��° �л� ���� ������ �Է��Ͻÿ�");
			Sc.score[3] = s.nextInt();
			System.out.println(number + "��° �л� ��ȸ ������ �Է��Ͻÿ�");
			Sc.score[4] = s.nextInt();
			System.out.println(number + "���� �л��� �� ������ �����Դϴ�.");
			System.out.println("����\t" + Sc.getScore()[0] + "\n����\t" + Sc.getScore()[1] + "\n����\t" + Sc.getScore()[2]
					+ "\n����\t" + Sc.getScore()[3] + "\n��ȸ\t" + Sc.getScore()[4]);
			int sum = Sc.getScore()[0] + Sc.getScore()[1] + Sc.getScore()[2] + Sc.getScore()[3] + Sc.getScore()[4];
			System.out.println("�հ��\t" + sum);
			float average = sum / 5;
			System.out.println("�����\t" + average);
			number++;
		}
		for (int i = 0; i < 3; i++) {
			rank[i] = 1;
		}
		for (int i = 0; i < 3; i++) {
	
			System.out.println("��� Ȯ�� ���α׷��Դϴ�. �ڽ��� ����� �Է��Ͻÿ�");
			score[i] = s.nextInt();
			System.out.println(stu + "�л� �����" + score[i]);
			stu++;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (score[i] < score[j])
					rank[i] = rank[i] + 1;
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "��°" + "�л��� ���" + rank[i]);
		}
	}

}
