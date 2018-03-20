import java.util.ArrayList;

class GameCharacter {
	private class GameItem {
		String name;
		int type;
		int price;

		int getPrice() {
			return price;
		}

		@Override
		public String toString() {
			return "GameItem [name=" + name + ",type=" + type + ",price=" + price + "]";
		}
	}

	private ArrayList<GameItem> list = new ArrayList<>();

	public void add(String name, int type, int price) {
		GameItem item = new GameItem();
		item.name = name;
		item.type = type;
		item.price = price;
		list.add(item);
	}

	public void print() {
		int total = 0;
		for (GameItem item : list) {
			System.out.println(item);
			total += item.getPrice();
		}
		System.out.println(total);
	}
}

public class GameCharcterTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
GameCharacter charac=new GameCharacter();
charac.add("창성의 구원자-대검", 1, 400000);
	charac.add("골드럭스", 2, 280000);
	charac.print();
	}

}
