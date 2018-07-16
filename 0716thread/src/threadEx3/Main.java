package threadEx3;

public class Main {

	public static void main(String[] args) {
		Account account = new Account();

		Deposit depo = new Deposit(account);
		depo.start();
		
		Withrawal with = new Withrawal(account);
		with.start();

	}

}
