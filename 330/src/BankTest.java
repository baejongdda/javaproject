class Bank{
	double getinerestRate(){
		return 0.0;
	}
}
class bBank{
	double getinerestRate(){
		return 20.0;
	}
}
class nBank{
	double getinerestRate(){
		return 5.0;
	}
}
class gBank{
	double getinerestRate(){
		return 1.0;
	}
}
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bBank b=new bBank();
nBank n=new nBank();
gBank g=new gBank();
System.out.println("bBank의 이자율"+b.getinerestRate());
System.out.println("nBank의 이자율"+n.getinerestRate());
System.out.println("gBank의 이자율"+g.getinerestRate());
	}

}
