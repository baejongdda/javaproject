import java.awt.FileDialog;

import javax.swing.JFrame;

public class file extends JFrame
{
	public file()
	{
		FileDialog load = new FileDialog(this, "������");
		FileDialog save = new FileDialog(this, "������", FileDialog.SAVE);

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		load.setVisible(true); // ���� �ҷ����� â ����
		System.out.println("�������� : " + load.getDirectory());
		System.out.println("�������� : " + load.getFile());
		save.setVisible(true); // ���� �����ϱ� â ����
	}

	public static void main(String[] args)
	{
		new file();

	}
}