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

		System.out.println("성적 관리 프로그램 입니다. 학생 이름을 입력하시오:");
		Sc.setName(s.nextLine());
		System.out.println("국어 점수를 입력하시오");
		Sc.score[0]=s.nextInt();
		System.out.println("수학 점수를 입력하시오");
		Sc.score[1]=s.nextInt();
		System.out.println("영어 점수를 입력하시오");
		Sc.score[2]=s.nextInt();
		System.out.println("과학 점수를 입력하시오");
		Sc.score[3]=s.nextInt();
		System.out.println("사회 점수를 입력하시오");
		Sc.score[4]=s.nextInt();
		System.out.println(Sc.getName()+"학생의 각 과목의 점수입니다.");
	    System.out.println("국어\t"+Sc.getScore()[0]+"\n수학\t"+Sc.getScore()[1]+"\n영어\t"+Sc.getScore()[2]+"\n과학\t"+Sc.getScore()[3]+"\n사회\t"
	    		+Sc.getScore()[4]);
	    int sum=Sc.getScore()[0]+Sc.getScore()[1]+Sc.getScore()[2]+Sc.getScore()[3]+Sc.getScore()[4];
	    System.out.println("합계는\t"+sum);
	   float average=sum/5;
	    System.out.println("평균은\t"+average);
	}

}
