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

	

		System.out.println("�̸��� �Է��Ͻÿ�");
		
		System.out.println("�Ա��� �ݾ��� �Է��Ͻÿ�");
		
		System.out.println("�̸��� " + obj.getName() + " ���� �ܰ�� "

				+ obj.getBalance() + "�Դϴ�.");

	}

}