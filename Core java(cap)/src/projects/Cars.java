package projects;
//encapsulation
public class Cars {
int year_of_pur;
String make;
int model;
double cost;

public void disp1()
{
	System.out.println("Year of purchase " + 2001);
	System.out.println("Make " + " Suzuki");
}

public void disp2()
{
	System.out.println("Model " + 1999);
	System.out.println("Cost " + 25000.50);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars c = new Cars();
		c.disp1();
		c.disp2();
		

	}

}
