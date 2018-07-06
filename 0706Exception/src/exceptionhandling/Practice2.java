package exceptionhandling;

public class Practice2 {

	public static void main(String[] args) {
		// 김기태, 이종범, 최향남, 이대진을
		// 번갈아가면서 무한반복해서 출력하는 로직
		String[] names = { "김기태", "이종범", "최향남", "이대진" };
		int size = names.length;
		int idx = 0;
		try {
			while (true) {
				System.out.println(names[idx % size]);
				idx = idx + 1;

				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
