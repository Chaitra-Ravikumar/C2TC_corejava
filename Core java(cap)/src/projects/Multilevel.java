package projects;

class Bird {
	void fly()
	{
		System.out.println("I am a Brid");
	}
}

class Parrot extends Bird {
	void whatcolorami()
	{
		System.out.println("I am green color");
	}
} 
public class Multilevel extends Parrot {
	void whatcanising()
	{
		System.out.println("I can sing opera");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevel m = new Multilevel();
		m.whatcanising();
		m.whatcolorami();
		m.fly();

	}

}
