package datastructure;

import java.util.ArrayList;
import java.util.Comparator;

public class ListMain4 {

	public static void main(String[] args) {
		ArrayList<Singer> list = new ArrayList();
		
		Singer singer = new Singer();
		singer.setName("배수지");
		singer.setAge(25);
		list.add(singer);
		
		singer = new Singer();
		singer.setName("김설현");
		singer.setAge(24);
		list.add(singer);
		
		singer = new Singer();
		singer.setName("배수지");
		singer.setAge(30);
		list.add(singer);
		
		Comparator<Singer> comp = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Singer first = (Singer)o1;
				Singer second = (Singer)o2;
				
				return first.getAge()-second.getAge();
			}
			
		};

		list.sort(comp);
		
		//각각의 데이터 확인
		for(Singer temp : list) {
			System.out.println(temp);
		}
	}

}
