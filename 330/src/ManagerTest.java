class Employee {
	public String name;
	String address;
	protected int salary;
	private int rrn;

	public Employee(String name, String address, int salary, int rrn) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.rrn = rrn;
	}

	@Override
	public String toString() {
return "Employee[name="+name +", address="+address+", salary="+salary+", rrn="+rrn+"]";
	}
}
class Manager extends Employee{
	private int bonus;
	
	public Manager(String name, String address, int salary, int rrn){
		super(name, address, salary, rrn);
		this.bonus=bonus;
	}
	void test(){
		System.out.println("name="+name);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
	}
}
public class ManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Manager m=new Manager("Tom","seoul",1000000,881101);
System.out.println(m);
m.test();
	}

}
