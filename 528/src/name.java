import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class name extends JFrame implements ActionListener {
	public name() {
		super("��ȭ��ȣ ����");
		FileDialog load = new FileDialog(this, "������");
		FileDialog save = new FileDialog(this, "������", FileDialog.SAVE);

		JOptionPane.showMessageDialog(this, "��ȭ��ȣ ���� ���α׷��Դϴ�.");

		System.out.println(JOptionPane.showConfirmDialog(this, "��ȭ��ȣ ����"));

		System.out.println(JOptionPane.showInputDialog(this, "�̸���?"));

		System.out.println(JOptionPane.showInputDialog(this, "���̴�?"));
		System.out.println(JOptionPane.showInputDialog(this, "��ȭ��ȣ��?"));

		System.out.println("�������� : " + load.getFile());
		save.setVisible(true);
		String path = save.getDirectory() + save.getFile();
		System.out.println(path);
		try {
			FileWriter f = new FileWriter(path);
			f.write("����Ϸ�>>");
			f.close();
		} catch (Exception e) {

		}

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new name();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}