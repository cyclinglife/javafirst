package abstracttest;

public class Android extends SmartPhone {
	public void call() {
		double x = 10.75;
		// 소수 첫째자리 반올림해서 출력하기
		System.out.println("안드로이드 x:" + (int) (x+0.5));
		// 소수 둘째자리 반올림해서 출력하기
		System.out.println("안드로이드 x:" + ((int) (x*10+0.5)/10.0));
		//10으로 나누지 않도록 주의
	}
}
