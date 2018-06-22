import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class TcpMultiChattingClient {
    final static int SERVER_PORT = 7777;
    final static String SERVER_IP = "127.0.0.1";
 
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("실행방법 :cmd>> cd 자신의 프로젝트 bin 파일>>"
            		+ " java TcpIpMultiChattingClient 사용자명");
            System.exit(0);
        }
 
        try {
            String sIp = SERVER_IP;
         
            Socket socket = new Socket(sIp, SERVER_PORT);
            System.out.println(" 연결.");
 
            Thread sender = new Thread(new ClientSender(socket, args[0]));
            Thread receiver = new Thread(new ClientReceiver(socket));
 
            sender.start();
            receiver.start();
        } catch (ConnectException e) {
            e.printStackTrace();
        } catch (Exception e) {
        }
    }
 
    static class ClientSender extends Thread {
        Socket sk;
        DataOutputStream out;
        String name;
 
        public ClientSender(Socket socket, String name) {
            this.sk = socket;
            try {
                out = new DataOutputStream(socket.getOutputStream());
                this.name = name;
            } catch (Exception e) {
            }
        }
 
        public void run() {
            Scanner scanner = new Scanner(System.in);
            try {
                if (out != null) {
                    out.writeUTF(name);
                }
 
                while (out != null) {
                    out.writeUTF( name+":"  + scanner.nextLine());
                }
            } catch (IOException e) {
            }
        }
    }
 
    static class ClientReceiver extends Thread {
        Socket sk;
        DataInputStream in;
 
        public ClientReceiver(Socket socket) {
            this.sk = socket;
            try {
                in = new DataInputStream(socket.getInputStream());
            } catch (IOException e) {
            }
        }
 
        public void run() {
            while (in != null) {
                try {
                    System.out.println(in.readUTF());
                } catch (IOException e) {
                }
            }
        }
    }
}

