import java.awt.FileDialog;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class phone extends JFrame {
	// ������ ����
	JFrame jFrame = new JFrame("Menu����");

	// Swing������ �ؽ�Ʈ ����.. ��ũ�ѹٰ� �������� �ʴ´�.
	JTextArea textArea = new JTextArea("���� �Է��ϼ���.", 5, 10);// ��ũ�ѹ� ����

	// Swing���� ��ũ�ѹٸ� �ֱ� ���� �Ʒ��� ���� ����Ѵ�.
	JScrollPane jp = new JScrollPane(textArea);// ��Ŭ�ѹ� �����

	// �޴� ����
	JMenuBar menuBar = new JMenuBar();
	JMenu fileMenu = new JMenu("����");
	JMenu helpMenu = new JMenu("Help");

	public phone() {
		FileDialog load = new FileDialog(this, "������");
		FileDialog save = new FileDialog(this, "������", FileDialog.SAVE);
		// ���� �޴� ����
		fileMenu.add(new JMenuItem("�� ����"));
		fileMenu.add(new JMenuItem("����"));
		fileMenu.add(new JMenuItem("����"));
		fileMenu.addSeparator(); // ���м� �߰�
		fileMenu.add(new JMenuItem("����"));

		// �޴��� �޴��ٿ� ���
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);

		// �޴��� �߰�
		jFrame.setJMenuBar(menuBar);

		// �ؽ�Ʈ ���� �߰�
		jFrame.add(jp, "Center");

		// ������ ũ�� ����
		jFrame.setSize(200, 300);

		// ������ ���̱�
		jFrame.setVisible(true);

		// swing���� �ִ� X��ư Ŭ���� ����
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		load.setVisible(true); // ���� �ҷ����� â ����
		System.out.println("�������� : " + load.getDirectory());
		System.out.println("�������� : " + load.getFile());
		save.setVisible(true); // ���� �����ϱ� â ����

	}

	public static void main(String[] args) {
		// ����
		new phone();
	}
}