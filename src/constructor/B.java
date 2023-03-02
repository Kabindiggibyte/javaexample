package constructor;

public class B extends A{
	public B() {
		this(10);
		System.out.println("non parametarized constructor");
	}
	public B(int a) {
		super();
		System.out.println("parametarized constructor");
	}
	public static void main(String[] args) {
		B b=new B();
	}

}
