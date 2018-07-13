package thread;

import java.util.Random;

//경주마 달리기 게임 마들기
public class ThreadEx4_Horse extends Thread {
	// 순위매기기
	private static int rank;

	public void run() {
		// 스레드 이름 출력
		System.out.println(getName() + "출발");

		// 현재 위치를 저장할 변수
		int pos = 0;
		// 랜덤한 값을 가져오기 위한 변수
		Random r = new Random();
		while (true) {
			try {
				Thread.sleep(1000);
				pos = pos + r.nextInt(10);
				if (pos > 50) {
					break;
				}
				System.out.println(getName() + ":" + pos);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		rank = rank + 1;
		System.out.println(getName() + "골인");
		System.out.println(getName() +" - " +rank + "등");
	}

}
