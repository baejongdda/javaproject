import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender {
	public static void main(String[] args) throws IOException {

		DatagramSocket sk = null;
		sk = new DatagramSocket();
		String s = "sfasfdasfdafda";
		byte[] buf = s.getBytes();

		InetAddress add = InetAddress.getByName("127.0.0.1");
		DatagramPacket pk = new DatagramPacket(buf, buf.length, add, 5000);
		sk.send(pk);
		sk.close();
	}
}

class Receiver {
	public static void main(String[] args) throws IOException {

		byte[] buf = new byte[256];

		DatagramSocket sk = new DatagramSocket(5000);
		DatagramPacket pk = new DatagramPacket(buf, buf.length);
		sk.receive(pk);
		System.out.println(new String(buf));
	}
}