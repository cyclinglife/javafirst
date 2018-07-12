package etc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class LogMain {

	public static void main(String[] args) {
		//로그파일의 내용을 읽을 수 있는 Scanner 만들기
		File f = new File("C:\\Users\\503-04\\Documents\\강민규\\Java\\자바수업\\log.txt");
		
		HashSet<String> set = new HashSet<String>();
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				//System.out.println(sc.nextLine()); //테스트 출력
				//한 줄씩 읽기
				String temp = sc.nextLine();
				//공백으로 분할하기
				String [] ar = temp.split(" ");
				//System.out.println(ar[0]); //테스트 출력
				set.add(ar[0]);
			}
			System.out.println(set);

			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
