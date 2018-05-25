import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class prec1 {

	static class mygui extends JFrame {
		mygui() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("이벤트 처리");
			this.setLayout(new FlowLayout());

			JTextField txt = new JTextField(10);
			JTextArea area = new JTextArea(10, 10);
			this.add(txt);
			this.add(area);

			txt.addKeyListener(new KeyAdapter() {
				public void keyReleased(KeyEvent e) {
					int Key = e.getKeyCode();

					if (Key == KeyEvent.VK_ENTER) {
						String str = txt.getText();
						area.setText(area.getText() + str + "\n");
						txt.setText("");
					}

					if (!(Key >= KeyEvent.VK_0 && Key <= KeyEvent.VK_9)) {
						String str = txt.getText();
						int strlen = str.length();
						if (strlen != 0)
							txt.setText(str.substring(0, strlen - 1));
					}

				}

			});

			setSize(400, 400);
			setVisible(true);
		}

	}

	public static void main(String[] args) {
		new mygui();
	}

}
