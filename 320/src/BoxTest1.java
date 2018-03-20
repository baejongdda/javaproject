
class Box {
	int width, length, height;

	Box(int w, int l, int h) {
		width = w;
		length = l;
		height = h;
	
	}
boolean isSameBox(Box obj){
	if((obj.width==width)&(obj.length==length)
			&(obj.height==height))
			return true;
	else
		return false;
}
}


public class BoxTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box obj1 = new Box(10, 20, 50);
		Box obj2 = new Box(10, 20, 50);

	
		System.out.println("obj1==obj2:"+obj1.isSameBox(obj2));
	}

}
