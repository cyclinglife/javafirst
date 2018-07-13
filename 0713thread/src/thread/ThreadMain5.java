package thread;

public class ThreadMain5 {

	public static void main(String[] args) {
		
		//Runnable 인터페이스를 implements 한 클래스의 인스턴스
		ThreadEx5 obj1	= new ThreadEx5("스레드1");
		ThreadEx5 obj2	= new ThreadEx5("스레드2");
		
		//스레드 생성
		Thread th1 = new Thread(obj1);
		Thread th2 = new Thread(obj2);
		
		//스레드의 우선순위 변경
		th1.setPriority(Thread.MIN_PRIORITY); //가장 낮은
		th2.setPriority(Thread.MAX_PRIORITY); //가장 높은
		
		//스레드 시작
		th1.start();
		th2.start();
		

	}

}
