package method;

public class Task {

	public void javaDisplay() {

		for (int i = 0; i < 3; i = i + 1) {
			System.out.println("Hello Java");
		}
	}

	// 1부터 100까지 더한 결과를 리턴해주는 메소드
	public int tot(int n) {
		int sum = 0;
		for (int i = 1; i < n + 1; i = i + 1) {
			sum = sum + i;
		}
		return sum;
	}

	// 로그인 처리 메소드
	// public 결과형 이름(매개변수) {
	public boolean login(String id, String pw) {
		boolean result = false;
		if (id.equals("root") && pw.equals("1234")) {
			result = true;
		}
		return result;

	}

	// 회원탈퇴
	public boolean deleteMember(String id, String pw) {
		boolean result = false;
		if (id.equals("root") && pw.equals("1234")) {
			result = true;
		}
		return result;

	}
}
