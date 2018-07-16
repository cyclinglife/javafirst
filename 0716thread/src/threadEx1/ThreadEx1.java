package threadEx1;

public class ThreadEx1 extends Thread {
	public void run() {
		// 1초마다 Thread라는 글자를 10번 출력
		int i = 0;
		while (i < 10) {
			System.out.println("Thread");

			// Thread 클래스의 static 메소드인
			// sleep(시간)일 이용
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("스레드 종료");
				//스레드를 강제 종료 할 수 있도록
				//예외가 발생하면 run 메소드 종료
				return;
			}

			i = i + 1;
		}
	}

}
