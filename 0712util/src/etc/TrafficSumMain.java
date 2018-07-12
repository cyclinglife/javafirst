package etc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TrafficSumMain {

	public static void main(String[] args) {
		// 로그 파일의 내용을 읽을 수 있는 Scanner 만들기
		File f = new File("C:\\Users\\503-04\\Documents\\강민규\\Java\\자바수업\\log.txt");

		int sum = 0;
		try {
			Scanner sc = new Scanner(f);

			// 읽을 다음 줄이 있을 때 까지 수행
			while (sc.hasNextLine()) {
				String temp = sc.nextLine();
				String[] ar = temp.split(" ");
				// System.out.println(ar[ar.length-1]);
				sum = sum + Integer.parseInt(ar[ar.length - 1]);
			}
			System.out.println(sum);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
