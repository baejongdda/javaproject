import java.util.HashMap;
import java.util.Scanner;

class phone {

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public int[] getAge() {
		return Age;
	}

	public void setAge(int[] age) {
		Age = age;
	}

	public int[] getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(int[] phonenum) {
		this.phonenum = phonenum;
	}

	String name[] = new String[10];
	int Age[] = new int[10];
	int phonenum[] = new int[10];

}

public class PhoneNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[30];
		int[] phones = new int[30];
		int[] AGe = new int[30];
		Scanner s = new Scanner(System.in);
		Scanner e = new Scanner(System.in);
		Scanner x = new Scanner(System.in);
		HashMap<String, String> dic =new HashMap<String, String>();
		int select = 8;
		int zero = 0;

		phone P = new phone();
		String[] option = { "����ó ���", "����ó ���", "����ó ����", "������" };
		System.out.println("����ó ���� ���α׷�");
		for (int i = 0; i < option.length; i++) {
			String a = option[i];
			System.out.println(i + 1 + "." + a);
		}
		while (select != 4) {
			System.out.println("���Ͻô� ����� �Է�");
			select = s.nextInt();
			switch (select) {
			case 2:
				System.out.println("�̸��� �Է��Ͻÿ�");
				names[zero] = s.next();
				System.out.println("���̸� �Է��Ͻÿ�.");
				AGe[zero] = s.nextInt();
				System.out.println("��ȭ ��ȣ�� �Է����ּ���.");
				phones[zero] = s.nextInt();
				zero++;
				break;
			case 1:
				for (int i = 0; i < zero; i++) {
					System.out.println((i + 1) + "�� " + "�̸�: " + names[i] + ", " + "����" + AGe[i] + "��ȭ��ȣ: 0" + phones[i]);

				}

				break;
			case 3:
				System.out.print("�̸� �Է� >>> ");

				names[zero]=s.next();

				if(dic.containsKey(names)){//�̸��� �����ϸ�

				dic.remove(names);

				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
break;
				}
			
			}
		}

	}

}