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
	int count;
	String abc;// ����
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
		Scanner s = new Scanner(System.in);
		information as = new information();
		System.out.println("�б����� �Է��Ͻÿ�");
		as.setSchoolname(s.next());
		System.out.println("�б�����\t" + as.getSchoolname());
		System.out.println("�а��� �Է��Ͻÿ�:");
		as.setGwa(s.next());
		System.out.println("�а���\t"+as.getGwa());
		System.out.println("�б��� "+as.getSchoolname() +"�а���"+as.getGwa());
		System.out.println("�ּҸ� �Է��ϼ���");
		as.setAdress(s.next());
		System.out.println("�ּҴ�\t" + as.getAdress());
	}

}
