package projects;

import java.util.*;

public class Lib {
    int accno;
	String title;
	String author;
	
	Scanner s = new Scanner(System.in);
	
	void input()
	{
		
		System.out.println("Enter the account number");
		int g = s.nextInt();
		
		System.out.println("Enter the tttle");
		String h = s.nextLine();
		System.out.println(" ");
		
		System.out.println("Enter the Author name");
		String i = s.nextLine();
		
	}
	
	void compute()
	{
		System.out.println("Accept the number of days");
		int no_days= s.nextInt();
		int fine=(no_days*5);
		System.out.println("Calculated amount is " +fine);
	}
	
	void display()
	{
		System.out.println("The accession number is " + accno);
		System.out.println("The title " + title);
		System.out.println("The author is " + author);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lib l = new Lib();
		l.input();
		l.compute();
		l.display();

	}

}
