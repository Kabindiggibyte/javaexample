package inheritance;

public class B extends A {
	int bonus=10000;
	public static void main(String[] args) {
		
		B b=new B();
		System.out.println("The employee salary is "+ b.salary);
		System.out.println("The employee Bonus is "+ b.bonus);
	}

}
