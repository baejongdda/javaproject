class Dice {
	private int face;

	int roll() {
		int face = (int) (Math.random() * 6) + 1;
		return face;
	}
}

public class DiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice dice = new Dice();
		System.out.println("�ֻ��� ����" + dice.roll());
	}

}
