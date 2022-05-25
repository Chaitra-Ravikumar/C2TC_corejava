package projects;

class superclass // parent class 
{
	void display()
	{
		System.out.println("I am super class");
	}
}

public class Subclass extends superclass{ //child class
	void display2()
	{
		System.out.println("I am sub class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclass s = new Subclass();
		s.display();
		s.display2();

	}

}
