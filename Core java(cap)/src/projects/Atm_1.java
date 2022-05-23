package projects;

class with_draw 
{
	int amt_withdraw = 2000;
}

public class Atm_1 extends with_draw {
	 int amt_left = 5000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm_1 a = new Atm_1();
		System.out.println("Amount withdraw "+ a.amt_withdraw);
		System.out.println("Amount balance "+ a.amt_left);

	}

}
