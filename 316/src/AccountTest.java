import java.util.Scanner;

class Account {

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}

public class AccountTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj = new Account();
Scanner scan=new Scanner(System.in);
int m;

System.out.println("�� �Է�:");
m=scan.nextInt();
 if(m>=1){
System.out.println(m+"�� �Ա�");
}else if(m==0){
System.out.println("1�� �̻����� �Է�");
}	
}
}
