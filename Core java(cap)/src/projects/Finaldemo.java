package projects;

final class a{
	final void run()
	{
		
	}

}

public class Finaldemo extends a{// we can call the final class as a subclass
	final int speedlimit=90;//final variable
	//int speedlimit=90;
	void run()
	{
		speedlimit=100; // we can't change the value of final variable 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finaldemo ob = new Finaldemo();
		a ob1 = new a();
		ob1.a();
		ob.run();

	}

}
