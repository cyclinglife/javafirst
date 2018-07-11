package datastructure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class ListMain3 {

	public static void main(String[] args) {
		// 정수 List와 문자열 List의 정렬
		ArrayList<Integer>list1 = new ArrayList<>();
		list1.add(40);
		list1.add(30);
		list1.add(35);
		
		Comparator<Integer>comp1 = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Integer first = (Integer)o1;
				Integer second = (Integer)o2;
				return first-second;
			}
			
		};

		list1.sort(comp1);
		//List는 toString이 재정의 되어 있어서 인스턴스를 출력하면
		//데이터가 순서대로 toString을 호출합니다.
		System.out.println(list1);
		
		LinkedList<String>list2 = new LinkedList<>();
		list2.add("고슬링");
		list2.add("아이린");
		list2.add("박지성");
		
		Comparator<String>comp2 = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				String first = (String)o1;
				String second = (String)o2;
				return first.compareTo(second);
			}
		};
		list2.sort(comp2);
		System.out.println(list2);
	}
}
