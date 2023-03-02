package variables;

public class nonStatic {
	int i;
	public static void main(String[] args) {
		nonStatic a=new nonStatic();
		a.i=1200;
		System.out.println(a.i);
	}

}
