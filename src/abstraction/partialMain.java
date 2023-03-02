package abstraction;

public class partialMain extends partial{

	@Override
	void print() {
		System.out.println("Implemented buisness logic");
		
	}
	public static void main(String[] args) {
		partial p=new partialMain();
		p.print();
	}

}
