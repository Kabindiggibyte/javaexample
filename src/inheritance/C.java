package inheritance;

public class C extends B{
	int id=24521;
	public static void main(String[] args) {
		C c=new C();
		System.out.println("The employee ID is "+ c.id);
		System.out.println("The employee salary is "+ c.salary);
		System.out.println("The employee Bonus is "+ c.bonus);
	}

}
