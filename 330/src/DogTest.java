class Animal {
	public void sound() {

	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("����");
	}

}
class Cat extends Animal {
	public void sound() {
		System.out.println("����");
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
