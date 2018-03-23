import java.util.Scanner;

class Account {
Scanner s=new Scanner(System.in);
	private int regNumber;

	private String name;

	private int balance;



	public String getName() {		return name;	}

	public void setName(String name) {		this.name = name;	}

	public int getBalance() {		return balance;	}

	public void setBalance(int balance) {		this.balance = balance;  }



}


public class AccountTest {



	public static void main(String[] args) {


		Account obj = new Account();

	

		System.out.println("이름을 입력하시오");
		
		System.out.println("입금할 금액을 입력하시오");
		
		System.out.println("이름은 " + obj.getName() + " 통장 잔고는 "

				+ obj.getBalance() + "입니다.");

	}

}