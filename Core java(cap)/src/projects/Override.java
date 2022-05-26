package projects;

class A
{
	void run()
	{
		System.out.println("Hi");
		
	}
}

class B
{
	void run()
	{
		System.out.println("Hello");
		//super.run();
	}
}

public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob = new A();
		B ob1 = new B();
		
		ob.run();
		ob1.run();

	}

}
