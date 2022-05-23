package projects;
//abstraction

abstract class atm
{
	abstract void withdraw();
}

public class Abst extends atm{
	void withdraw()
	{
		System.out.println("Withdraw successful");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abst ab = new Abst();
		ab.withdraw();

	}

}
