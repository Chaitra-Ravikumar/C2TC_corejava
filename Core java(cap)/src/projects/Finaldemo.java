package projects;

public class Finaldemo {
	final int speedlimit=90;//final variable
	//int speedlimit=90;
	void run()
	{
		speedlimit=100; // we can't change the value of final variable 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finaldemo ob = new Finaldemo();
		ob.run();

	}

}
