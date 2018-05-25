import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String name, age, number;
		HashMap<String, String> map = new HashMap<String, String>();
		Scanner s = new Scanner(System.in);
		int select = 10;

		System.out.println("전화번호부 프로그램입니다 ");
		String[] option = { "연락처 등록", "연락처 목록", "연락처 삭제", "끝내기" };
		for (int i = 0; i < option.length; i++) {
			String a = option[i];
			System.out.println(i + 1 + "." + a);
		}
		while (select != 4) {
			System.out.println("원하시는 기능을 선택하시오");
			select = s.nextInt();
			switch (select) {
			case 1:
				System.out.println("이름을 입력하시오");
				name = s.next();
				System.out.println("나이를 입력하시오");
				age = s.next();
				System.out.println("전화번호를 입력하시오");
				number = s.next();
				String pn ="나이"+ age +"전화번호"+ number;
				map.put(name, pn);
				break;

			case 2:
				Set<String> keys=map.keySet();

				Iterator<String> it =keys.iterator();
				
				while(it.hasNext()){

				String key=it.next();

				String value=map.get(key);

				System.out.println(key+","+value);

				}

				break;
			case 3:
				System.out.println("이름을 입력하시오");
				name = s.next();
				if (map.containsKey(name)) {// containsKey 메소드는 맵(Map)에 해당 키(key)가 있는지를 조사하여 그 결과값을 리턴한다.
					map.remove(name);
				} else
					System.out.println("이름이 틀렸습니다");

			}
		}
	}
}