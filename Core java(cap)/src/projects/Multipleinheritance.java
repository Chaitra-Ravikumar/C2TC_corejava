package projects;//using interface to support multiple inheritance in java

interface rbi
{
	float rateofintrest();
}

interface worldbank
{
	float roi();
}
public class Multipleinheritance implements rbi, worldbank{
	public float rateofintrest()
	{
		return 9.15f;
	}
	
	public float roi()
	{
		return 10.25f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multipleinheritance mi = new Multipleinheritance();
		
		System.out.println("Rate of intrest is " + mi.rateofintrest());
		System.out.println("Rate of intrest is " + mi.roi());

	}

}
