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
		setTitle("����");
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
			System.out.println("����");

			while (true) {
				sk = svsk.accept();
				System.out.println(sk.getInetAddress() + "���� ����");

				svrv thread = new svrv(sk);
				thread.start();
				System.out.println("������ ��" + thread.getName());
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
				System.out.println("����");
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
				System.out.println("io����");
			}
		}

		public void run() {
			String nm = "";

			try {
				nm = in.readUTF();
				sendtoall(nm + "����");

				cl.put(nm, out);
				System.out.println("���� �����ڼ�" + cl.size());
				System.out.println("������ ���:");

				while (in != null) {
					sendtoall(in.readUTF());
				}

			} catch (IOException e) {
				System.out.println("io ����1");
			} finally {
				sendtoall(nm + "����");
				cl.remove(nm);
				System.out.println(sk.getInetAddress() + ":" + sk.getPort() + "���� ����");
				System.out.println("���� ������ ��" + cl.size());
			}
		}
	}

}
