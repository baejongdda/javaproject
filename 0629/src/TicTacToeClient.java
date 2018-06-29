import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicTacToeClient extends Thread {
	private JButton[][] btn = new JButton[3][3];
	private char me, u;
	private JFrame fr;
	private JPanel pn;
	private JLabel ms;
	private Socket sk;
	private BufferedReader in;
	private PrintWriter out;

	public TicTacToeClient() throws UnknownHostException, IOException {

		sk = new Socket("127.0.0.1", 9001);

		in = new BufferedReader(new InputStreamReader(sk.getInputStream()));
		out = new PrintWriter(sk.getOutputStream(), true);

		fr = new JFrame();
		pn = new JPanel();
		pn.setLayout(new GridLayout(3, 3, 5, 5));
		Font f = new Font("Dialog", Font.ITALIC, 50);

		ms = new JLabel("표시");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.add(pn, BorderLayout.CENTER);
		fr.add(ms, BorderLayout.SOUTH);
		fr.setSize(300, 300);
		fr.setVisible(true);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				final int ii = i;
				final int jj = j;
				btn[i][j] = new JButton(" ");
				btn[i][j].setFont(f);
				btn[i][j].addActionListener(e -> {
					btn[ii][jj].setText(" " + me);
					out.println("move" + ii + " " + jj);
				});
				pn.add(btn[i][j]);
			}
		}
		pn.repaint();
	}

	public void run() {
		String respone;
		try {
			respone = in.readLine();

			if (respone.startsWith("start")) {
				me = respone.charAt(6);
				u = (me == 'x') ? 'o' : 'x';
				ms.setText("경기 시작");
				fr.setTitle("턴"+me);
			}
			while (true) {
				respone = in.readLine();
				if (respone.startsWith("OTHER")) {
					int i = Integer.parseInt(respone.substring(6, 7));
					int j = Integer.parseInt(respone.substring(8, 9));
					btn[i][j].setText("" + u);
					ms.setText("상대의 턴");
				} else if (respone.startsWith("print")) {
					ms.setText(respone.substring(6));
				}
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		catch (IOException e) 
		{e.printStackTrace();}
		finally {
			try {sk.close();} catch (IOException e) {e.printStackTrace();}

		}
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		TicTacToeClient cl = new TicTacToeClient();
		cl.start();	
	}

}
