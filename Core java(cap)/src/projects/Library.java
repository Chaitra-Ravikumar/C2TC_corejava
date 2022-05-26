package projects;

public class Library {
	int account_no;
	String Title;
	String Author;
	
	void input()
	{
		System.out.println("Accession number  :" + 456);
	}
	
	void compute()
	{
		System.out.println("After due date the fine charge : +5 " );
		account_no = +5;
	}
	
	void display()
	{
		System.out.print(" Accession number \t "+  " Title \t " + " Author \n");
		System.out.print(" \t 456 \t" + " \t JFS  \t" + " \t Don \t");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l = new Library();
		l.input();
		l.compute();
		l.display();
		

	}

}
