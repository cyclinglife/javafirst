package threadEx2;

public class MutexMain {

	public static void main(String[] args) {
		Bank bank = new Bank();
		//스레드 인스턴스 만들기
		Run atm = new Run(bank, "ATM");
		atm.start();
		
		Run internet = new Run(bank, "internet");
		internet.start();

	}

}
