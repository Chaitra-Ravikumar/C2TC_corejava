package projects;

public class Functionoverload {
	
	void prnsqr(int i)
	{
		System.out.println("Square of the integer " + i + "is" + i*i);
	}
	
	void prnsqr(char c)
	{
		System.out.println(c+ " is a character ");
	}

	void prnsqr(float f)
	{
		System.out.println("Square of float " + f+ "is "+ f*f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functionoverload fl = new Functionoverload();
		fl.prnsqr(5);
		fl.prnsqr('a');
		fl.prnsqr(3);
		
	}
}
