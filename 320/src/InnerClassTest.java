class outerClass{
	private int value=10;
	
	class innerClass{
		public void myMethod(){
			System.out.println("�ܺ� Ŭ������ private������"+value);
		}
	}
	outerClass(){
		innerClass obj=new innerClass();
		obj.myMethod();
	}
}






public class InnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
outerClass outer=new outerClass();
	}

}
