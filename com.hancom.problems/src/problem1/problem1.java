package problem1;

import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {


		int idx = 0;
		Scanner sc = new Scanner(System.in);
		int NUM = sc.nextInt();
			
		// ----------------------------------------------------- ��ü for		
		for (int i = 0; i < NUM; i = i + 1) {

			int j;
			// ------------------------------------------------- ���� ���� + ����
			for (j = 0; j <= (NUM-1) - i; j = j + 1) {
				System.out.print(" ");
			}
			System.out.print(idx % 10);
			idx = idx + 1;

			// ------------------------------------------------- 2 ~ NUM-1 ��
			if (i >= 1 && i <= (NUM-2)) {
				for (j = 0; j < 2 * i - 1; j = j + 1)
					System.out.print(" ");
				System.out.print(idx % 10);
				idx = idx + 1;
			}
			
			// ------------------------------------------------- ������ ��
			if (i == (NUM-1)) {
				for (j = 0; j < 2 * i; j = j + 1) {
					System.out.print(idx % 10);
					idx = idx + 1;
				}
			}
			
			System.out.println(" ");
		}

		sc.close();
	}
}
