package projects;


public class Cube {
	void cube (int s)
	{
		System.out.println("The volume  of the cube " + "is " + s*s*s );
	}
	
	void cubiod(int l,int b,int h)
	{
		System.out.println("The volume  of the cubiod "  + "is " + l*b*h);
	}
	 
	void sphere(double a,double c,int r)
	{    
		System.out.println("The volume of the Sphere  " + "is " + a*c*r*r*r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube m = new Cube();
		m.cube(4);
		m.cubiod(4, 5, 6);
		m.sphere(1.333, 3.14, 5);
		

	}

}
