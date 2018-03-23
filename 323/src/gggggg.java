import java.util.Scanner;

public class gggggg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int regnumber;
		String name;
		int balance;
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("이름을 입력하시오");
		name=s.next();
		System.out.println("입금할 돈을 입력하시오");
		balance=s.nextInt();
		
		
		if(balance <= 0){
			System.out.println("0보다 큰 값을 입력하시오");
		}else
				System.out.println("이름은"+name+"통장잔고는"+balance);
		
		
	}

}
