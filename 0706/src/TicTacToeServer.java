import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TicTacToeServer {

	public static void main(String[] args) throws Exception {
		ServerSocket svsk = new ServerSocket(9001);
		System.out.println("����");

		try {
			while (true) {
				Game g = new Game();

				player p1 = new player(g, svsk.accept(), 'X');
				player p2 = new player(g, svsk.accept(), 'O');

				p1.setu(p2);
				p2.setu(p1);

				p1.start();
				p2.start();
				System.out.println("��� ����");
			}
		} finally {
			svsk.close();
		}
	}
}

class Game {
	char[][] bd = new char[5][5];

	public void setbd(int i, int j, char playerm) {
		bd[i][j] = playerm;
	}

	public char getbd(int i, int j) {
		return bd[i][j];
	}

	public void printboard() {
		for (int k = 0; k < 3; k++) {
			System.out.println("" + bd[k][0] + "|" + bd[k][1] + "|" + bd[k][2]);
			if (k != 2)
				System.out.println("---|---|---");

		}
	}
}

class player extends Thread {
	Game gam;
	Socket sk;
	BufferedReader in;
	PrintWriter out;
	char playerm;
	player u;

	public player(Game gam, Socket sk, char playerm) {
		this.gam = gam;
		this.sk = sk;
		this.playerm = playerm;
		try {
			in = new BufferedReader(new InputStreamReader(sk.getInputStream()));
			out = new PrintWriter(sk.getOutputStream(), true);
			out.println("����" + playerm);
			out.println("��ٸ�����");
		} catch (IOException e) {
			System.out.println("���� ����" + e);
		}
	}

	public void setu(player u) {
		this.u = u;
	}

	public void run() {
		try {
			out.println("PRINT ����Ϸ�");

			if (playerm == 'x') {
				out.println("PRINT your turn");
			}
			while (true) {
				String cmd = in.readLine();
				if (cmd == null)
					continue;
				if (cmd.startsWith("MOVE")) {
					int i = Integer.parseInt(cmd.substring(5, 6));
					int j = Integer.parseInt(cmd.substring(7, 8));
					gam.setbd(i, j, playerm);
					gam.printboard();
					u.out.println("u" + i + "" + j);
					out.println("����� ��");
					u.out.println("����� ��");
				} else if (cmd.startsWith("quit")) {
					return;
				}
			}

		} catch (IOException e) {
			System.out.println("���� ����" + e);
		} finally {
			try {
				sk.close();
			} catch (IOException e) {

			}
		}

	}
}