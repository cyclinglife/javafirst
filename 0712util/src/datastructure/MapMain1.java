package datastructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapMain1 {

	public static void main(String[] args) {
		// 이름과 나이 및 소속 회사를 저장하는 맵을 생성
		// HashpMap은 key의 순서를 알 수 없음
		// HashMap<String, Object> map = new HashMap<>();

		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		// TreeMap<String, Object> map = new TreeMap<>();
		map.put("Project", "MinimalLife");
		map.put("Category1", "생활용품");
		map.put("Category2", "소형가전");
		map.put("Item", "커피메이커");

		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key+" : "+map.get(key));
		}
	}
}
