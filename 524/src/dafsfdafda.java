
import java.util.Scanner;

public class dafsfdafda {

  public static void main(String[] args) {
  // 간단 전화번호부
  
  //배열 및 변수 초기화
  String[] names = new String[30];
  int[] phones = new int[30];
  int Position = 0;
  
  Scanner sc = new Scanner(System.in);
  Scanner nc = new Scanner(System.in);
  Scanner pc = new Scanner(System.in);
  
  for(; ;){ // 종료 명령 전까지 무한 루프
   System.out.println("**전화번호부**");
   System.out.println("1.조회");
   System.out.println("2.입력");
   System.out.println("3.종료");
   System.out.println();
   System.out.println("번호를 선택하세요:");
   int a = sc.nextInt(); //메뉴 선택
   
   
   // 배열에 저장된 데이터 출력
   if(a==1){
    if(Position>0){
     for(int i=0; i<Position; i++){
      System.out.println((i+1)+"번 "+"이름: "+names[i]+", "+"전화번호: "+phones[i]);
     }
     System.out.println("저장된 번호 수는 총 "+Position+"개");
     System.out.println();
    } 
    else{
     System.out.println("저장된 데이터가 없습니다");
     System.out.println();
    }
   } // if 1 종료
   
   
   // 배열에 데이터 입력 및 저장
   else if(a==2){
    System.out.println("이름을 입력하세요>>");
    names[Position] = nc.next();
    System.out.println("전화번호를 입력하세요>>");
    phones[Position] = pc.nextInt();
    System.out.println((Position+1)+"번에 저장 되었습니다.");
    Position++;
    System.out.println();
   } // if 2 종료
   
   
   
   //종료
   else if(a==3){
    System.out.println("전화번호부를 종료합니다.");
    break;
   } // if 3 종료
   
   else{
    System.out.println("잘못된 입력입니다");
   }
   
   //30개의 배열에 모든 데이터가 찼을 때 발생하는 출력문
   if(Position>=names.length){
    System.out.println("더이상 저장할 공간이 없습니다.");
   }
   
  }

 }
}

