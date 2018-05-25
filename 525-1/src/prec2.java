import java.awt.*;
import javax.swing.*;

public class prec2 {

	static class mygui extends JFrame {
		mygui() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("girdlayout연습");

			this.setLayout(new GridLayout(10, 10));

			JButton[] btn = new JButton[9];

			for (int i = 0; i <btn.length; i++) {
				btn[i] = new JButton("버튼" + (i + 1));
				this.add(btn[i]);
			}
			setSize(256, 256);
			setVisible(true);
		}

	}

	private static void main(String[] args) {
		new mygui();

	}
}
