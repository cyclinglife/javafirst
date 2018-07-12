package etc;

import java.util.StringTokenizer;

public class StringTokenMain {

	public static void main(String[] args) {
		String msg = "소설은 훗날 성장한 엘리오가 그해 여름을 회상하는 것으로 시작해...";

		// msg를 공백단위로 분할해서 출력
		// 1-1. split 메소드 이용
		String[] ar = msg.split(" ");
		for (String token : ar) {
			System.out.println(token);
		}
		System.out.println("================");

		// 1-2. StringTokenizer 메소드 이용
		StringTokenizer st = new StringTokenizer(msg, " ");
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		System.out.println("================");

		
		String data = "30,32,5,60";
		// data를 , 단위로 분할해서 합계를 구하기
		// 2-1. split 메소드 이용
		String[] tokens = data.split(",");
		int sum = 0;
		for (String token : tokens) {
			// 잘라진 토큰을 정수로 변환해서 더하기
			sum = sum + Integer.parseInt(token);
		}
		System.out.println("합계 : " + sum);
		System.out.println("================");

		// 2-2. StringTokenizer 메소드 이용
		st = new StringTokenizer(data, ",");
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}

	}

}
