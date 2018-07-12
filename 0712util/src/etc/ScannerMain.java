package etc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		
		//한 줄을 입력받는 객체
		//String msg = sc.nextLine();
		
		//공백 단위로 구분해서 입력받기
		String msg = sc.next();
		System.out.println(msg);
		
		//스캐너를 사용하면 마지막에 닫아 주어야 합니다.
		sc.close();
		
		//문자열로 받기
		sc = new Scanner("Hello Java World Class Mate");
		System.out.println(sc.next());
		System.out.println(sc.nextLine());
		sc.close();
		
		//file 객체 만들기
		File f = new File("C:\\Users\\503-04\\Documents\\강민규\\Java\\"
				+ "thisisjava-sourcefile\\chap01\\src\\sec06\\exam01\\hello.java");
		//파일과 연결되는 스캐너 객체 만들기
		try {
			sc = new Scanner(f);
			//데이터가 있을 때 까지 읽기
			//파일은 있는데 내용을 못읽는 경우는 2가지 인데
			//구분문자가 없는 경우이고 한글 인코딩이 서로 다른 경우입니다.
			//한글 인코딩이 잘못되면 글자가 깨지는게 아니고 scanner는 읽지를 못합니다.
			//공백 문자를 찾아야 하는데 인코딩이 다르면 공백문자의 코드 값이 다릅니다.
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
