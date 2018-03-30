class Animal {
	public void sound() {

	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("けけ");
	}

}
class Cat extends Animal {
	public void sound() {
		System.out.println("いし");
	}

}


public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d=new Dog();
d.sound();
Cat c=new Cat();
c.sound();
	}

}
