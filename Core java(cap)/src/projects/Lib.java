package projects;

import java.util.*;

public class Lib {
    int Accno;
	String Title;
	String Author;
	
     void input()
	{
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter the tttle");
 		Title = s.nextLine();
 		System.out.print("");
 		
 		
		System.out.println("Enter the Author name");
		 Author = s.nextLine();
		
		System.out.println("Enter the account number");
	     Accno = s.nextInt();
	}
	
	void compute()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Accept the number of days");
		int no_days= s.nextInt();
		int fine=(no_days*5);
		System.out.println("Calculated amount is " +fine);
	}
	
	void display()
	{
		System.out.println(" Accession number \tTitle\tAuthor \t ");
		System.out.print( Accno         + "\t"    +   Title     +"\t"+       Author);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lib l = new Lib();
		l.input();
		l.compute();
		l.display();

	}

}
