
import java.util.Scanner;

 class ArrayProc {

	public void getValues(int[] array) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("성적을 입력 ");
			array[i] = scan.nextInt();
		}
	}

	public double getAverage(int[] array) {
		double total = 0;
		for (int i = 0; i < array.length; i++)
			total += array[i];
		return total / array.length;
	}
	}

public class ArrayProcTest{
	final static int STUDENTS = 5;

	public static void main(String[] args) {
		int[] scores = new int[STUDENTS];
		ArrayProc obj = new ArrayProc();
		obj.getValues(scores);
		System.out.println("평균은 =" + obj.getAverage(scores));
	}

}