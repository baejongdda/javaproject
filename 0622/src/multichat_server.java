import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class frserver extends JFrame {
	JTextArea txt;
	JTextField tf;

	public frserver() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("서벌");
		setLayout(new BorderLayout());

		JLabel lb = new JLabel("server");
		txt = new JTextArea(25, 40);
		tf = new JTextField(25);

		add(lb, BorderLayout.NORTH);
		add(txt, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		setVisible(true);
	}
}

public class multichat_server {
	HashMap cl;

	multichat_server() {
		cl = new HashMap();
		Collections.synchronizedMap(cl);
	}

	public static void main(String[] args) {
		frserver f = new frserver();
		new multichat_server().start();

	}

	public void start() {
		ServerSocket svsk = null;
		Socket sk = null;

		try {
			svsk = new ServerSocket(7777);
			System.out.println("시작");

			while (true) {
				sk = svsk.accept();
				System.out.println(sk.getInetAddress() + "에서 접속");

				svrv thread = new svrv(sk);
				thread.start();
				System.out.println("스레드 넴" + thread.getName());
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	void sendtoall(String msg) {
		java.util.Iterator it = cl.keySet().iterator();

		while (it.hasNext()) {
			try {
				DataOutputStream out = (DataOutputStream) cl.get(it.next());
				out.writeUTF(msg);
			} catch (IOException e) {
				System.out.println("에러");
			}
		}
	}

	class svrv extends Thread {
		Socket sk;
		DataInputStream in;
		DataOutputStream out;

		public svrv(Socket sk) {
			this.sk = sk;
			try {
				in = new DataInputStream(sk.getInputStream());
				out = new DataOutputStream(sk.getOutputStream());

			} catch (IOException e) {
				System.out.println("io에러");
			}
		}

		public void run() {
			String nm = "";

			try {
				nm = in.readUTF();
				sendtoall(nm + "입장");

				cl.put(nm, out);
				System.out.println("현재 접속자수" + cl.size());
				System.out.println("접속자 목록:");

				while (in != null) {
					sendtoall(in.readUTF());
				}

			} catch (IOException e) {
				System.out.println("io 에러1");
			} finally {
				sendtoall(nm + "나감");
				cl.remove(nm);
				System.out.println(sk.getInetAddress() + ":" + sk.getPort() + "에서 종료");
				System.out.println("현재 접속자 수" + cl.size());
			}
		}
	}

}
