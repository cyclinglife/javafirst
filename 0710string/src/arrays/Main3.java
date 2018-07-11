package arrays;

import java.util.Arrays;

public class Main3 {

	public static void main(String[] args) {
		//문자열 배열 생성
		String [] subject = {"Java", "Oracle", "Web Front End",
				"Web Back End - Java", "Android", "iOS"};
		
		//subject 정렬
		Arrays.sort(subject);
		//배열의 데이터 전부 출력
		for(String temp : subject) {
			System.out.println(temp);
		}
		//Oracle 위치 검색
		int idx = Arrays.binarySearch(subject, "Oracle");
		System.out.println(idx); //1
		
		//Android 위치 검색
		idx = Arrays.binarySearch(subject, "Android");
		System.out.println(idx); //정렬되지 않아서 -1이 나온다
	}

}
