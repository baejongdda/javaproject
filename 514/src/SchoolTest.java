
import java.util.Scanner;

class information {
	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getGwa() {
		return gwa;
	}

	public void setGwa(String gwa) {
		this.gwa = gwa;
	}

	String schoolname;
	String adress;
	int date;
	String gwa;
}

class SchoolRule {

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int[] getSTU() {
		return STU;
	}

	public void setSTU(int[] sTU) {
		STU = sTU;
	}

	int count = 0;
	int[] STU = new int[5];// �л� ��ȣ

}

class activity {
	String schoolActivity;
}

class Room {
	String classRoom;
	String TrainningRoom;
	String theachersOffice;

}

class Classgrade {
	int grade;
	String StudentName;
}

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select = 9;
		int num = 5;
		int number = 0;
		int[] stk = new int[5];
		int nnumber = 0;
		Scanner s = new Scanner(System.in);
		information as = new information();
		SchoolRule SR = new SchoolRule();
		System.out.println("�б����� �Է��Ͻÿ�");
		as.setSchoolname(s.next());
		System.out.println("�б�����\t" + as.getSchoolname());
		System.out.println("�а��� �Է��Ͻÿ�:");
		as.setGwa(s.next());
		System.out.println("�а���\t" + as.getGwa());
		System.out.println("�б��� " + as.getSchoolname() + "�а���" + as.getGwa());
		System.out.println("�ּҸ� �Է��ϼ���");
		as.setAdress(s.next());
		System.out.println("�ּҴ�\t" + as.getAdress());
		while (select != 3) {
			System.out.println("<1>�� <2>�� <3>��");
			select = s.nextInt();
			switch (select) {
			case 1:
				System.out.println("1���л� ������");
				while (num != 3) {
					System.out.println("1.����+:1 2.����-1 3.��");
					num = s.nextInt();
					switch (num) {
					case 1:
						SR.STU[number] = nnumber++;

						System.out.println("1�� �л� ������ " + ++SR.STU[number] + "\n");
						SR.count++;
						break;
					case 2:
						SR.STU[number] = nnumber--;

						System.out.println("1�� �л� ������ " + --SR.STU[number] + "\n");
						SR.count--;
						break;
					case 3:
						System.out.println("1�� �л��� ����:"+number);
					}
				}
				break;

			case 2:
				System.out.println("2���л� �赵��");
				while (num != 3) {
					System.out.println("1.����+:1 2.����-1 3.��");
					num = s.nextInt();
					switch (num) {
					case 1:
						SR.STU[number] = nnumber++;

						System.out.println("2�� �л� ������ " + ++SR.STU[number] + "\n");
						SR.count++;
						break;
					case 2:
						stk[number] = nnumber--;

						System.out.println("2�� �л� ������ " + --SR.STU[number] + "\n");
						SR.count--;
					case 3:
						System.out.println("1�� �л��� ����:"+number);
						break;

					}

				}

			}

		}
	}
}