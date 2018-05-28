import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class name extends JFrame implements ActionListener {
	public name() {
		super("전화번호 관리");
		FileDialog load = new FileDialog(this, "열기모드");
		FileDialog save = new FileDialog(this, "저장모드", FileDialog.SAVE);

		JOptionPane.showMessageDialog(this, "전화번호 관리 프로그램입니다.");

		System.out.println(JOptionPane.showConfirmDialog(this, "전화번호 수정"));

		System.out.println(JOptionPane.showInputDialog(this, "이름은?"));

		System.out.println(JOptionPane.showInputDialog(this, "나이는?"));
		System.out.println(JOptionPane.showInputDialog(this, "전화번호는?"));

		System.out.println("선택파일 : " + load.getFile());
		save.setVisible(true);
		String path = save.getDirectory() + save.getFile();
		System.out.println(path);
		try {
			FileWriter f = new FileWriter(path);
			f.write("저장완료>>");
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