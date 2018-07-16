package threadEx2;

public class Bank {
	// �옍�븸�쓣 ���옣�븷 蹂��닔
	private int balance = 1000;

	// �옍�븸�쓣 蹂�寃쏀븯�뒗 硫붿냼�뱶
	public void job(String msg) {
		// this - �궡 �옄�떊�쓽 �옄�썝�쓣 �궗�슜�븯�뒗 寃쎌슦
		// �씠 肄붾뱶�뒗 �븳 踰덉뿉 �닔�뻾�릺�룄濡� �꽕�젙
		synchronized (this) {
			System.out.println(msg + "�쁽�옱 �옍�븸 : " + balance);
			balance = balance - 100;
			// 1珥� ��湲�
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(msg + "�옉�뾽 �썑 �쁽�옱 �옍�븸 : " + balance);
		}
	}
}
