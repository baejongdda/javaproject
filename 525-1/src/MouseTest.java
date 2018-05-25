import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseTest {

	static class mygui extends JFrame {

		mygui() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("이벤트 처리2");
			this.setLayout(new FlowLayout());

			JTextField txtx = new JTextField(10);
			JTextField txty = new JTextField(10);
			this.add(txtx);
			this.add(txty);

			this.addMouseListener(new MouseListener() {

				@Override
				public void mouseReleased(MouseEvent e) {
					txtx.setText(Integer.toString(e.getX()));
					txty.setText(Integer.toString(e.getY()));
				}

				@Override
				public void mousePressed(MouseEvent e) {

				}

				@Override
				public void mouseExited(MouseEvent e) {

				}

				@Override
				public void mouseEntered(MouseEvent e) {

				}

				@Override
				public void mouseClicked(MouseEvent e) {

				}
			});
			setSize(500, 200);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		new mygui();
	}

}
