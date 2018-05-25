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
		String[] option = { "연락처 출력", "연락처 등록", "연락처 삭제", "끝내기" };
		System.out.println("연락처 관리 프로그램");
		for (int i = 0; i < option.length; i++) {
			String a = option[i];
			System.out.println(i + 1 + "." + a);
		}
		while (select != 4) {
			System.out.println("원하시는 기능을 입력");
			select = s.nextInt();
			switch (select) {
			case 2:
				System.out.println("이름을 입력하시오");
				names[zero] = s.next();
				System.out.println("나이를 입력하시오.");
				AGe[zero] = s.nextInt();
				System.out.println("전화 번호를 입력해주세요.");
				phones[zero] = s.nextInt();
				zero++;
				break;
			case 1:
				for (int i = 0; i < zero; i++) {
					System.out.println((i + 1) + "번 " + "이름: " + names[i] + ", " + "나이" + AGe[i] + "전화번호: 0" + phones[i]);

				}

				break;
			case 3:
				System.out.print("이름 입력 >>> ");

				names[zero]=s.next();

				if(dic.containsKey(names)){//이름이 존재하면

				dic.remove(names);

				System.out.println("삭제가 완료되었습니다.");
break;
				}
			
			}
		}

	}

}