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

public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Score Sc = new Score();

		System.out.println("���� ���� ���α׷� �Դϴ�. �л� �̸��� �Է��Ͻÿ�:");
		Sc.setName(s.nextLine());
		System.out.println("���� ������ �Է��Ͻÿ�");
		Sc.score[0]=s.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�");
		Sc.score[1]=s.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�");
		Sc.score[2]=s.nextInt();
		System.out.println("���� ������ �Է��Ͻÿ�");
		Sc.score[3]=s.nextInt();
		System.out.println("��ȸ ������ �Է��Ͻÿ�");
		Sc.score[4]=s.nextInt();
		System.out.println(Sc.getName()+"�л��� �� ������ �����Դϴ�.");
	    System.out.println("����\t"+Sc.getScore()[0]+"\n����\t"+Sc.getScore()[1]+"\n����\t"+Sc.getScore()[2]+"\n����\t"+Sc.getScore()[3]+"\n��ȸ\t"
	    		+Sc.getScore()[4]);
	    int sum=Sc.getScore()[0]+Sc.getScore()[1]+Sc.getScore()[2]+Sc.getScore()[3]+Sc.getScore()[4];
	    System.out.println("�հ��\t"+sum);
	   float average=sum/5;
	    System.out.println("�����\t"+average);
	}

}
