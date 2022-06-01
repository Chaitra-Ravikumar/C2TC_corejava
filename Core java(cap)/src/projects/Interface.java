package projects;

interface Myinterface
{
	public void method1();
	public void method2();
}
 
 public class Interface implements Myinterface {
	public void method1()
	{
		System.out.println("Implementation of method 1");
	}
	public void method2()
	{
		System.out.println("Implementation of method 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface ob = new Interface();
		ob.method1();
		ob.method2();

	}

}
