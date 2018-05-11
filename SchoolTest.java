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
	String abc;// 보류
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
		System.out.println("학교명을 입력하시오");
		as.setSchoolname(s.next());
		System.out.println("학교명은\t" + as.getSchoolname());
		System.out.println("학과를 입력하시오:");
		as.setGwa(s.next());
		System.out.println("학과는\t"+as.getGwa());
		System.out.println("학교는 "+as.getSchoolname() +"학과는"+as.getGwa());
		System.out.println("주소를 입력하세요");
		as.setAdress(s.next());
		System.out.println("주소는\t" + as.getAdress());
	}

}
