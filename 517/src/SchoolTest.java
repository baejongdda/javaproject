
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
	int[] STU = new int[5];// 학생 번호

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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String[] getStudentName() {
		return StudentName;
	}

	public void setStudentName(String[] studentName) {
		StudentName = studentName;
	}

	int grade;
	String StudentName[] = new String[4];
}

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select = 9;
		int num = 5;
		int number = 0;
		int nnumber = 0;
		Scanner s = new Scanner(System.in);
		SchoolRule SR = new SchoolRule();
		Classgrade Cg = new Classgrade();
		System.out.println("상점 프로그램 입니다 학생 이름을 입력하세요:");
		Cg.StudentName[0] = s.next();
		System.out.println("학생 이름을 입력하세요:");
		Cg.StudentName[1] = s.next();
		System.out.println("학생 이름을 입력하세요:");
		Cg.StudentName[2] = s.next();
		System.out.println("학생 이름을 입력하세요:");
		Cg.StudentName[3] = s.next();
		System.out.println(Cg.StudentName[0] + " 학생\t" + Cg.StudentName[1] + " 학생\t" + Cg.StudentName[2] + " 학생\t"
				+ Cg.StudentName[3] + " 학생\t");
		// System.out.printf("1번째 숫자 : ");
		// aa[0] = s.nextInt();
		
		while (select != 3) {
			// System.out.println("<1>번째 학생 <2>번째 학생 <3>번째 학생 <4>번째 학생 <5>종료");
			System.out.println("상점 조회를 할 학생을 입력하시오(종료는 5번):");
			select = s.nextInt();
			switch (select) {
			case 1:
				System.out.println(Cg.StudentName[0] + "학생");
				while (num != 3) {
					System.out.println("1.상점+:1 2.상점-1 3.끝");
					num = s.nextInt();
					switch (num) {
					case 1:
						SR.STU[number] = nnumber++;

						System.out.println(Cg.StudentName[0] + " 학생 상점은 " + ++SR.STU[number] + "\n");
						SR.count++;
						break;
					case 2:
						SR.STU[number] = nnumber--;

						System.out.println(Cg.StudentName[0] + " 학생 상점은 " + --SR.STU[number] + "\n");
						SR.count--;
						break;
					case 3:
						System.out.println(Cg.StudentName[0] + " 학생의 상점:" + number);
					}
				}
				break;

			case 3:
				System.out.println(Cg.StudentName[2]+"학생");
				while (num != 3) {
					System.out.println("1.상점+:1 2.상점-1 3.끝");
					num = s.nextInt();
					switch (num) {
					case 1:
						SR.STU[number] = nnumber++;

						System.out.println(Cg.StudentName[2] + " 학생 상점은 " + ++SR.STU[number] + "\n");
						SR.count++;
						break;
					case 2:
						SR.STU[number] = nnumber--;

						System.out.println(Cg.StudentName[2] + " 학생 상점은 " + --SR.STU[number] + "\n");
						SR.count--;
						break;
					case 3:
						System.out.println(Cg.StudentName[2] + " 학생의 상점:" + number);
					}
				}
				break;
			case 4:
				System.out.println(Cg.StudentName[3]+"학생");
				while (num != 3) {
					System.out.println("1.상점+:1 2.상점-1 3.끝");
					num = s.nextInt();
					switch (num) {
					case 1:
						SR.STU[number] = nnumber++;

						System.out.println(Cg.StudentName[3] + " 학생 상점은 " + ++SR.STU[number] + "\n");
						SR.count++;
						break;
					case 2:
						SR.STU[number] = nnumber--;

						System.out.println(Cg.StudentName[3] + " 학생 상점은 " + --SR.STU[number] + "\n");
						SR.count--;
						break;
					case 3:
						System.out.println(Cg.StudentName[3] + " 학생의 상점:" + number);
					}
				}
				break;
			case 5:
		System.out.println("종료합니다.");
			}

		}

	}

}