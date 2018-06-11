import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class gui1 {
	static class mygui extends JFrame {
		mygui() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("컴포넌트 연습 3");

			this.setLayout(new FlowLayout());

			JTextField txt1 = new JTextField(10);
			this.add(txt1);
			JTextArea txt2 = new JTextArea(5, 10);
			this.add(txt2);
			this.add(new JScrollPane(txt2));

			JPasswordField txt3 = new JPasswordField(10);
			this.add(txt3);

			setSize(200, 200);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new mygui();

	}

}
