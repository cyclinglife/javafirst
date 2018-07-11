package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// 인스턴스 배열 만들기
		// 아직은 모두 null
		Book[] books = new Book[4];

		// 인스턴스 생성
		books[0] = new Book();
		// 값을 채웁니다.
		books[0].setTitle("뽀로로");
		books[0].setAuthor("지은이");
		books[0].setIspn("9791133419821");
		books[0].setPrice(42000);

		// 인스턴스 생성
		books[1] = new Book();
		// 값을 채웁니다.
		books[1].setTitle("막국수");
		books[1].setAuthor("이쵸케");
		books[1].setIspn("9791133419822");
		books[1].setPrice(35000);

		// 인스턴스 생성
		books[2] = new Book();
		// 값을 채웁니다.
		books[2].setTitle("비빔국수");
		books[2].setAuthor("손맛");
		books[2].setIspn("9791133419823");
		books[2].setPrice(9400);

		// 인스턴스 생성
		books[3] = new Book();
		// 값을 채웁니다.
		books[3].setTitle("초계국수");
		books[3].setAuthor("장인");
		books[3].setIspn("9791133419824");
		books[3].setPrice(12000);

		// 배열의 데이터를 정렬
		// 기본적으로 정렬을 하려면 각 데이터의 크기를 비교할 수 있어야 합니다.
		// java에서 크기 비교를 하는 메소드는
		// Comparble 인터페이스의 compare 메소드입니다.
		// 직접 만든 클래스의 경우는 클래스에 Comparable 인터페이스를
		// implements 하던가 Comparator 인터페이스를 implements한
		// 인스턴스를 같이 대입해야 합니다.

		Scanner sc = new Scanner(System.in);

		while (true) {
			// 비교할 comparator
			Comparator<Book> comparator = null;
			System.out.print("0:종료   1:제목오름차순   2.제목내림차순  : ");
			
			int menu = sc.nextInt();
			if (menu == 0) {
				System.out.print("===========종료합니다===========.");
				break;
				
			} else if (menu == 1) {
				comparator = new Comparator() {

					@Override
					public int compare(Object o1, Object o2) {
						Book book1 = (Book) o1;
						Book book2 = (Book) o2;
						return book1.getTitle().compareTo(book2.getTitle());
					}

				};
			}

			else if (menu == 2) {
				comparator = new Comparator() {

					public int compare(Object o1, Object o2) {
						Book book1 = (Book) o1;
						Book book2 = (Book) o2;
						return book2.getTitle().compareTo(book1.getTitle());
					}

				};

			}

			Arrays.sort(books, comparator);
			// 배열의 데이터를 전부 출력
			for (Book temp : books) {
				System.out.println(temp);
			}
			System.out.println("==================================================================\n");
		}
	}
}
