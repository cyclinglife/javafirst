package thread;

public final class ThreadMain3 {

	public static void main(String[] args) {
		// Runnable 인터페이스를 inplements 한 클래스를 이용해서 스레드 시작
		//start() 메소드가 Thread를 상속받았기 때문에 아래와 같이 실행
		ThreadEx3 obj = new ThreadEx3();
		Thread th = new Thread(obj);
		th.start();


	}

}
