import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class gui {
	static class mygui extends JFrame {
		mygui() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("������Ʈ ���� 2");

			this.setLayout(new FlowLayout());

			JButton btn1 = new JButton("��ư");
			this.add(btn1);

			JLabel lbl1 = new JLabel("���̺� 1");
			JLabel lbl2 = new JLabel("2");
			this.add(lbl1);
			this.add(lbl2);

			JCheckBox chk1 = new JCheckBox("c++");
			JCheckBox chk2 = new JCheckBox("java");
			JCheckBox chk3 = new JCheckBox("C#", true);
			this.add(chk1);
			this.add(chk2);
			this.add(chk3);

			JRadioButton rdo1 = new JRadioButton("��");
			JRadioButton rdo2 = new JRadioButton("���");
			JRadioButton rdo3 = new JRadioButton("����");

			this.add(rdo1);
			this.add(rdo2);
			this.add(rdo3);

			ButtonGroup grp = new ButtonGroup();
			grp.add(rdo1);
			grp.add(rdo2);
			grp.add(rdo3);

			setSize(200, 300);
			setVisible(true);

		}

	}

	public static void main(String[] args) {
		new mygui();

	}

}
