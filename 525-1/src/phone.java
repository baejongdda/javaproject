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

		System.out.println("��ȭ��ȣ�� ���α׷��Դϴ� ");
		String[] option = { "����ó ���", "����ó ���", "����ó ����", "������" };
		for (int i = 0; i < option.length; i++) {
			String a = option[i];
			System.out.println(i + 1 + "." + a);
		}
		while (select != 4) {
			System.out.println("���Ͻô� ����� �����Ͻÿ�");
			select = s.nextInt();
			switch (select) {
			case 1:
				System.out.println("�̸��� �Է��Ͻÿ�");
				name = s.next();
				System.out.println("���̸� �Է��Ͻÿ�");
				age = s.next();
				System.out.println("��ȭ��ȣ�� �Է��Ͻÿ�");
				number = s.next();
				String pn ="����"+ age +"��ȭ��ȣ"+ number;
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
				System.out.println("�̸��� �Է��Ͻÿ�");
				name = s.next();
				if (map.containsKey(name)) {// containsKey �޼ҵ�� ��(Map)�� �ش� Ű(key)�� �ִ����� �����Ͽ� �� ������� �����Ѵ�.
					map.remove(name);
				} else
					System.out.println("�̸��� Ʋ�Ƚ��ϴ�");

			}
		}
	}
}