package threadEx1;

public class ThreadMain1 {

	public static void main(String[] args) {
		//클래스의 run 메소드 사용
		// static이 붙지 않은 클래스는 반드시 인스턴스를 생성
		ThreadEx1 th1 = new ThreadEx1();
		//데몬 스레드로 설정
		//다른 스레드가 작업 중이 아니면 자동 종료
		th1.setDaemon(true);
		//스레드 시작
		th1.start();
		
		try {
			Thread.sleep(2000);
			//InterruptedException을 발생시킵니다.
			th1.interrupt();
			 
			//Thread.sleep(3000);
			//System.out.println("메인 종료");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


	}

}
