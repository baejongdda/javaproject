public class BankAccountTest {
	private int acnum;
	private int money;
	private String nam;
	private int eeza;

	private int getMoney() {
		return money;
	}

	private void setMoney(int money) {
		this.money = money;
	}

	private String getNam() {
		return nam;
	}

	private void setNam(String nam) {
		this.nam = nam;
	}

	private int getEeza() {
		return eeza;
	}

	private void setEeza(int eeza) {
		this.eeza = eeza;
	}

	private int getAcnum() {
		return acnum;
	}

	private void setAcnum(int acnum) {
		this.acnum = acnum;
	}



public BankAccountTest()
{
}

public BankAccountTest(String n,int a,int b,int e){
nam=n;
acnum=a;
money=b;
eeza=e;
	
	
	
}

}