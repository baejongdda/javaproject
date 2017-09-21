package prac;

import java.util.Scanner;

public class prac01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a;

		System.out.printf("주사위를 던지시오: ");
		a = s.nextInt();

		switch (a) {
		default:
			System.out.printf("%d가 나왔다.\n",a);
		}
	}

}
