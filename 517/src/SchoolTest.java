
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
		System.out.println("���� ���α׷� �Դϴ� �л� �̸��� �Է��ϼ���:");
		Cg.StudentName[0] = s.next();
		System.out.println("�л� �̸��� �Է��ϼ���:");
		Cg.StudentName[1] = s.next();
		System.out.println("�л� �̸��� �Է��ϼ���:");
		Cg.StudentName[2] = s.next();
		System.out.println("�л� �̸��� �Է��ϼ���:");
		Cg.StudentName[3] = s.next();
		System.out.println(Cg.StudentName[0] + " �л�\t" + Cg.StudentName[1] + " �л�\t" + Cg.StudentName[2] + " �л�\t"
				+ Cg.StudentName[3] + " �л�\t");
		// System.out.printf("1��° ���� : ");
		// aa[0] = s.nextInt();
		
		while (select != 3) {
			// System.out.println("<1>��° �л� <2>��° �л� <3>��° �л� <4>��° �л� <5>����");
			System.out.println("���� ��ȸ�� �� �л��� �Է��Ͻÿ�(����� 5��):");
			select = s.nextInt();
			switch (select) {
			case 1:
				System.out.println(Cg.StudentName[0] + "�л�");
				while (num != 3) {
					System.out.println("1.����+:1 2.����-1 3.��");
					num = s.nextInt();
					switch (num) {
					case 1:
						SR.STU[number] = nnumber++;

						System.out.println(Cg.StudentName[0] + " �л� ������ " + ++SR.STU[number] + "\n");
						SR.count++;
						break;
					case 2:
						SR.STU[number] = nnumber--;

						System.out.println(Cg.StudentName[0] + " �л� ������ " + --SR.STU[number] + "\n");
						SR.count--;
						break;
					case 3:
						System.out.println(Cg.StudentName[0] + " �л��� ����:" + number);
					}
				}
				break;

			case 3:
				System.out.println(Cg.StudentName[2]+"�л�");
				while (num != 3) {
					System.out.println("1.����+:1 2.����-1 3.��");
					num = s.nextInt();
					switch (num) {
					case 1:
						SR.STU[number] = nnumber++;

						System.out.println(Cg.StudentName[2] + " �л� ������ " + ++SR.STU[number] + "\n");
						SR.count++;
						break;
					case 2:
						SR.STU[number] = nnumber--;

						System.out.println(Cg.StudentName[2] + " �л� ������ " + --SR.STU[number] + "\n");
						SR.count--;
						break;
					case 3:
						System.out.println(Cg.StudentName[2] + " �л��� ����:" + number);
					}
				}
				break;
			case 4:
				System.out.println(Cg.StudentName[3]+"�л�");
				while (num != 3) {
					System.out.println("1.����+:1 2.����-1 3.��");
					num = s.nextInt();
					switch (num) {
					case 1:
						SR.STU[number] = nnumber++;

						System.out.println(Cg.StudentName[3] + " �л� ������ " + ++SR.STU[number] + "\n");
						SR.count++;
						break;
					case 2:
						SR.STU[number] = nnumber--;

						System.out.println(Cg.StudentName[3] + " �л� ������ " + --SR.STU[number] + "\n");
						SR.count--;
						break;
					case 3:
						System.out.println(Cg.StudentName[3] + " �л��� ����:" + number);
					}
				}
				break;
			case 5:
		System.out.println("�����մϴ�.");
			}

		}

	}

}