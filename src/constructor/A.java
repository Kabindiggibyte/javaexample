package constructor;

public class A {
	public A(){
		this(12.0f);
		System.out.println("non parametarized constructor");
	}
	public A(float a) {
		System.out.println("parametarized constructor");
	}

}
