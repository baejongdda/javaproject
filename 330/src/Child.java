class Parent{
	public void print(){
		System.out.println("부모 클래스의 print()메소드");
	}
}




public class Child extends Parent {
	public void print(){
		super.print(); //Parent 클래스 메소드 호출 
		System.out.println("자식 클래스의 print()메소드");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child obj=new Child();
obj.print();
	}

}
