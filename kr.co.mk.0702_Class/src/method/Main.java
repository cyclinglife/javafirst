package method;

//First라는 클래스를 생성

class Address {
	// 이렇게 클래스 안에 static없이 만들어진 변수를 instance 변수라고 합니다.
	// 이 변수들은 객체가 만들어질 때 각 객체마다 별도로 메모리를 할당받습니다.

	int num; // 번호를 저장하기 위한 변수
	String name; // 이름을 저장하기 위한 변수
	String phone; // 전화번호를 저장하기 위한 변수

	// static 변수 - 공유
	static String schoolName;

	// TEN이라는 변수는 10을 저장, 변경할 수 없습니다.
	static int x = 10;
	static final int TEN = x;
}

public class Main {

	public static void main(String[] args) {

		// Task 클래스의 인스턴스 생성(여러번 사용할거면 이렇게 이름 만들기)
		Task ins = new Task();

		// 메소드 호출
		ins.javaDisplay();

		System.out.println("Hello C++");

		// 메소드 호출
		ins.javaDisplay();

		int result = new Task().tot(50); // =5050;
		System.out.println("합계 : " + result);

		boolean r = new Task().login("xxx", "yyy");
		if (r == true) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("없는 아이디 이거나 비밀번호가 틀렸습니다.");
		}

		boolean d = new Task().deleteMember("root", "1234");
		if (d == true) {
			
			System.out.println("회원 탈퇴 완료");
		} else {
			System.out.println("없는 아이디 이거나 비밀번호가 틀렸습니다.");
		}
	}

}
