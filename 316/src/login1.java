import java.util.*;
public class login1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s;
String id="abcde123";
String pw="123123";
Scanner scan=new Scanner(System.in);
System.out.print("아이디를 입력하세요");
s=scan.next();
System.out.print("비밀번호를 입력하세요");
s=scan.next();
if(s.equalsIgnoreCase(id)){
}
if(s.equalsIgnoreCase(pw))
	System.out.println("로그인 성공");
	else
		System.out.println("로그인 실패");
	}

}
