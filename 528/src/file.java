import java.awt.FileDialog;

import javax.swing.JFrame;

public class file extends JFrame
{
	public file()
	{
		FileDialog load = new FileDialog(this, "열기모드");
		FileDialog save = new FileDialog(this, "저장모드", FileDialog.SAVE);

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		load.setVisible(true); // 파일 불러오기 창 열기
		System.out.println("선택폴더 : " + load.getDirectory());
		System.out.println("선택파일 : " + load.getFile());
		save.setVisible(true); // 파일 저장하기 창 열기
	}

	public static void main(String[] args)
	{
		new file();

	}
}