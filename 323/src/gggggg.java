import java.util.Scanner;

public class gggggg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int regnumber;
		String name;
		int balance;
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("�̸��� �Է��Ͻÿ�");
		name=s.next();
		System.out.println("�Ա��� ���� �Է��Ͻÿ�");
		balance=s.nextInt();
		
		
		if(balance <= 0){
			System.out.println("0���� ū ���� �Է��Ͻÿ�");
		}else
				System.out.println("�̸���"+name+"�����ܰ��"+balance);
		
		
	}

}
