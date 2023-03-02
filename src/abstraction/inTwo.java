package abstraction;

public class inTwo implements inOne {

	@Override
	public void print() {
		System.out.println("Interface implemented buisness logic");
		
	}
	public static void main(String[] args) {
		inOne i=new inTwo();
		i.print();
	}

}
