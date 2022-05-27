package projects;
//when variable is declared as static all the objects will have same location 


public class Sc {
	static int age;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sc ob = new Sc();
		Sc ob1 = new Sc();
		ob.age=30;
		ob1.age=40;
		System.out.println("Age is " + ob.age);
		System.out.println("Age is " + ob1.age);

	}

}
