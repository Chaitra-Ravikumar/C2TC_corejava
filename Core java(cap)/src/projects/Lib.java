package projects;

import java.util.*;

public class Lib {
    int accno;
	String title;
	String author;
	
	Scanner s = new Scanner(System.in);
	
     void input()
	{
    	System.out.println("Enter the tttle");
 		String title = s.nextLine();
 		System.out.print("");
 		
 		
		System.out.println("Enter the Author name");
		String author = s.nextLine();
		
		System.out.println("Enter the account number");
		int accno = s.nextInt();
		
		
		
		
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
		System.out.print(" Accession number \t "+ accno +"  Title    Author  ");
		//System.out.println("\t" + accno + "\t" + title + "\t" + author );
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lib l = new Lib();
		l.input();
		l.compute();
		l.display();

	}

}
