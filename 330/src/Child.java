class Parent{
	public void print(){
		System.out.println("�θ� Ŭ������ print()�޼ҵ�");
	}
}




public class Child extends Parent {
	public void print(){
		super.print(); //Parent Ŭ���� �޼ҵ� ȣ�� 
		System.out.println("�ڽ� Ŭ������ print()�޼ҵ�");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child obj=new Child();
obj.print();
	}

}
