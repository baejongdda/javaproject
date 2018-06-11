import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class caculator extends JFrame {
	public caculator() {
		setSize(230, 300);
		setTitle("°è»ê±â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();

		JButton jbt = new JButton("c");
		panel.setLayout(new GridLayout(1, 1, 5, 5));
		panel2.setLayout(new GridLayout(1, 1, 5, 5));
		panel3.setLayout(new GridLayout(4, 4, 5, 5));
		JTextField txtf = new JTextField(25);
		panel.add(txtf);
		panel2.add(jbt);
		String[] a = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "+/-", "", "=", "+" };

		JButton[] button = new JButton[16];
		for (int i = 0; i < a.length; i++) {
			button[i] = new JButton(a[i]);
			panel3.add(button[i]);
		}
		add(panel);
		add(panel2);
		add(panel3);
		setVisible(true);
	}
}

public class cal {
	public static void main(String[] args) {
		caculator C = new caculator();

	}

}
