import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public static void main(String[] args) throws IOException {   ServerSocket ss = new ServerSocket(9100);   try {    while (true) {     Socket socket = ss.accept();     try {      PrintWriter out = new PrintWriter(socket.getOutputStream(),        true);      out.println(new Date().toString());     } finally {      socket.close();     }    }   } finally {    ss.close();   }  } } 
public class DateClient { 
 
    public static void main(String[] args) throws IOException {         Socket s = new Socket("localhost", 9100);         BufferedReader input =             new BufferedReader(new InputStreamReader(s.getInputStream()));         String res = input.readLine();         System.out.println(res);         System.exit(0);     } }