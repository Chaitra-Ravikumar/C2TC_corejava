package projects;

public class Example {
	
	Example()
	{
		System.out.println("Default constructor");
	}
	
	Example(int i,int j)
	{
		System.out.println("Constructor with the two parameters");
	}
	
	Example(int a, int b, int c)
	{
		System.out.println("Constructor with the three parameters");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example e = new Example();
		Example ob = new Example(1,2);
		Example obj = new Example(3,4,5);

	}

}
