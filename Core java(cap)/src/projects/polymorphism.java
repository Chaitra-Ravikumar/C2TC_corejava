package projects;

public class polymorphism {
	void add(int x, int y)
	{
		System.out.println("Addition two numbwr " + (x+y));
	}
	void add(int x, int y,int z)
	{
		System.out.println("Addition three numbwr " + (x+y+z));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymorphism op = new polymorphism();
		op.add(5, 8);
		op.add(6, 4,2);

	}

}
