package datastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		LinkedHashSet<String> song = new LinkedHashSet<>();
		song.add("BAAM");
		song.add("장마");
		song.add("빨간 맛");
		song.add("11:11");
		song.add("BAAM");
		for(String s : song) {
			System.out.println(s);
		}

	}

}
