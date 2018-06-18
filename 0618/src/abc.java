import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class abc {

	static class mygui extends JFrame {
		mygui() {
			JPanel panel = new JPanel();
			setTitle("제목");

			setSize(600, 500);

			String tabel[] = { "이름", "국어", "수학", "영어" };
			String num[][] = {};
			DefaultTableModel model = new DefaultTableModel(num, tabel);
			JTable jtable = new JTable(model);
			JScrollPane scp = new JScrollPane(jtable);

			panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

			JTextField label1 = new JTextField(3);
			JTextField label2 = new JTextField(3);
			JTextField label3 = new JTextField(3);
			JTextField label4 = new JTextField(3);

			panel.add(label1);
			panel.add(label2);
			panel.add(label3);
			panel.add(label4);

			JButton re = new JButton("수정");
			re.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					int i = jtable.getSelectedRow();

					if (i >= 0) {
						model.setValueAt(label1.getText(), i, 0);
						model.setValueAt(label2.getText(), i, 1);
						model.setValueAt(label3.getText(), i, 2);
						model.setValueAt(label4.getText(), i, 3);
					} else {
						System.out.println("행 선택을 하세요.");
					}
				}
			});
			JButton neww = new JButton("저장");
			neww.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String str[] = new String[4];

					str[0] = label1.getText();
					str[1] = label2.getText();
					str[2] = label3.getText();
					str[3] = label4.getText();
					model.addRow(str);

					label1.setText("");
					label2.setText("");
					label3.setText("");
					label4.setText("");
				}
			});
			JButton delete = new JButton("삭제");
			delete.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if (jtable.getSelectedRow() == -1) {
						return;
					} else {
						model.removeRow(jtable.getSelectedRow());
					}
				}
			});

			add(panel, BorderLayout.SOUTH);
			add(scp);

			panel.add(neww);
			panel.add(delete);
			panel.add(re);
			setVisible(true);

		}
	}

	public static void main(String[] args) {
		new mygui();

	}

}