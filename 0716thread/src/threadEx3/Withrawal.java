package threadEx3;

public class Withrawal extends Thread {
	private Account account;
	
	public Withrawal(Account account) {
		this.account = account;
	}
	public void run() {
		for(int i=0; i<5; i=i+1) {
			account.withrawal();
		}
	}

}
