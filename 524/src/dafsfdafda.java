
import java.util.Scanner;

public class dafsfdafda {

  public static void main(String[] args) {
  // ���� ��ȭ��ȣ��
  
  //�迭 �� ���� �ʱ�ȭ
  String[] names = new String[30];
  int[] phones = new int[30];
  int Position = 0;
  
  Scanner sc = new Scanner(System.in);
  Scanner nc = new Scanner(System.in);
  Scanner pc = new Scanner(System.in);
  
  for(; ;){ // ���� ��� ������ ���� ����
   System.out.println("**��ȭ��ȣ��**");
   System.out.println("1.��ȸ");
   System.out.println("2.�Է�");
   System.out.println("3.����");
   System.out.println();
   System.out.println("��ȣ�� �����ϼ���:");
   int a = sc.nextInt(); //�޴� ����
   
   
   // �迭�� ����� ������ ���
   if(a==1){
    if(Position>0){
     for(int i=0; i<Position; i++){
      System.out.println((i+1)+"�� "+"�̸�: "+names[i]+", "+"��ȭ��ȣ: "+phones[i]);
     }
     System.out.println("����� ��ȣ ���� �� "+Position+"��");
     System.out.println();
    } 
    else{
     System.out.println("����� �����Ͱ� �����ϴ�");
     System.out.println();
    }
   } // if 1 ����
   
   
   // �迭�� ������ �Է� �� ����
   else if(a==2){
    System.out.println("�̸��� �Է��ϼ���>>");
    names[Position] = nc.next();
    System.out.println("��ȭ��ȣ�� �Է��ϼ���>>");
    phones[Position] = pc.nextInt();
    System.out.println((Position+1)+"���� ���� �Ǿ����ϴ�.");
    Position++;
    System.out.println();
   } // if 2 ����
   
   
   
   //����
   else if(a==3){
    System.out.println("��ȭ��ȣ�θ� �����մϴ�.");
    break;
   } // if 3 ����
   
   else{
    System.out.println("�߸��� �Է��Դϴ�");
   }
   
   //30���� �迭�� ��� �����Ͱ� á�� �� �߻��ϴ� ��¹�
   if(Position>=names.length){
    System.out.println("���̻� ������ ������ �����ϴ�.");
   }
   
  }

 }
}

