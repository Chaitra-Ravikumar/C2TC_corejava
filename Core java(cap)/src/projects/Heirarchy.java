package projects;

class Birds {
	void fly()
	{
		System.out.println("I am a Bird");
	}
}

class Parrots extends Birds {
	void whatcolorami()
	{
		System.out.println("I am Green ");
	}
} 

class Crow extends Birds {
	void whatcolorami()
	{
		System.out.println("I am Black");
	}
}

public class Heirarchy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parrots par = new Parrots();
		Crow cr = new Crow();
		//call methods for parrot class
		par.whatcolorami();
		par.fly(); 
		
		System.out.println();
		
		//call methods for crow class
		cr.whatcolorami();
		cr.fly();
	}
}
