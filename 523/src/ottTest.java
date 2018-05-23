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
			System.out.println(number + "번째 학생 국어 점수를 입력하시오");
			Sc.score[0] = s.nextInt();
			System.out.println(number + "번째 학생 수학 점수를 입력하시오");
			Sc.score[1] = s.nextInt();
			System.out.println(number + "번째 학생 영어 점수를 입력하시오");
			Sc.score[2] = s.nextInt();
			System.out.println(number + "번째 학생 과학 점수를 입력하시오");
			Sc.score[3] = s.nextInt();
			System.out.println(number + "번째 학생 사회 점수를 입력하시오");
			Sc.score[4] = s.nextInt();
			System.out.println(number + "번쨰 학생의 각 과목의 점수입니다.");
			System.out.println("국어\t" + Sc.getScore()[0] + "\n수학\t" + Sc.getScore()[1] + "\n영어\t" + Sc.getScore()[2]
					+ "\n과학\t" + Sc.getScore()[3] + "\n사회\t" + Sc.getScore()[4]);
			int sum = Sc.getScore()[0] + Sc.getScore()[1] + Sc.getScore()[2] + Sc.getScore()[3] + Sc.getScore()[4];
			System.out.println("합계는\t" + sum);
			float average = sum / 5;
			System.out.println("평균은\t" + average);
			number++;
		}
		for (int i = 0; i < 3; i++) {
			rank[i] = 1;
		}
		for (int i = 0; i < 3; i++) {
	
			System.out.println("등수 확인 프로그램입니다. 자신의 평균을 입력하시오");
			score[i] = s.nextInt();
			System.out.println(stu + "학생 평균은" + score[i]);
			stu++;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (score[i] < score[j])
					rank[i] = rank[i] + 1;
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "번째" + "학생의 등수" + rank[i]);
		}
	}

}
