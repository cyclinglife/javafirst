package abstracttest;

public class WinPhone extends SmartPhone {

	@Override
	public void call() {
		int time = 132400;
		//위에 저장 된 값이 초라고 가정하고 몇 시간 몇 분 몇 초인지 출력
		int hour = time /3600;
		int minute = (time % 3600)/60;
		int second = time % 60;
		System.out.println(hour + "시간"+minute+"분"+second+"초");
		
		//입력된 금액을 5만원권, 만원권, 천원권으로 나누는 출력
		int money = 135000;
		int oman = money / 50000;
		int man = (money % 50000)/10000;
		int cheon = (money % 10000)/1000;
		System.out.println("오만원권 "+oman +"장, 만원권 "+man+"장, 천원권 "+cheon+"장");

	}

}
