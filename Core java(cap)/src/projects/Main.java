package projects;//super keywors program

class TestParentClass
{
	int var = 100;
}

class TestChildClass extends TestParentClass
{
	int var = 50;
	
	void display()
	{
		System.out.println("The var value of child " + var);
		System.out.println("The var value of child " + super.var);
		
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TestChildClass tc = new  TestChildClass();
		 tc.display();

	}

}
