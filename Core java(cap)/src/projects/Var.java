package projects;

public class Var {
	static int j = 100;
	int n =200;
	static void a() {
		int a =200;
		System.out.println("Print from a");
		//n=100;
		//a2();
		//System.out.println(super j);
		//we cant call non-static method and variable inside static method 
	}

	void a2()
	{
		System.out.println("Inside a2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var ob1 = new Var();
		ob1.a2();
		Var.a();//calling class with static method
	}

}
