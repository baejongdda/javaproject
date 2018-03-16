import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		char s2;
		int count1 = 0, count2 = 0, count3 = 0,count4=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열과 숫자입력");
s=scan.next();
for(int i=0; i<s.length(); i++){
	s2=s.charAt(i);
if(s2>='A' && s2<='Z'){
count1++;
}else if(s2>='a' && s2<='z'){
count2++;	
}else if(s2>='0'&&s2<='9'){
	count3++;
}else if(s2>='~'&&s2<=')'){
	count4++;
}
}
System.out.println("대문자는"+count1);
System.out.println("소문자는 "+count2);
System.out.println("숫자는"+count3);
System.out.println("특수문자는"+count4);
	}

}
