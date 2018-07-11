package datastructure;

import java.util.ArrayList;

public class ListMain1 {
	
	public void main(String[]args) {
		//문자열을 저장할 수 있는 ArrayList 생성
		ArrayList<String> arrayList = new ArrayList();
		//데이터를 삽입
		arrayList.add("이고운");
		arrayList.add("강민규");
		arrayList.add("신수지");
		arrayList.add("황유진");
		arrayList.add("이소라");
		//데이터 개순
		System.out.println("데이터 개수 :"+arrayList.size());
	}

}
