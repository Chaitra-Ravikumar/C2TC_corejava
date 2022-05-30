package projects;

public class Stat {
	static int a;
	static int b;
	static {  //this block i.e static block gets exceuted first by jvm then main method 
		a =10;
		b=20;
		System.out.println("Hii!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		System.out.println("The value of a " +a);
		System.out.println("The value of b " +b);

	}

}
