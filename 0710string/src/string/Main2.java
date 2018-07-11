package string;

public class Main2 {
	public static void main(String[] args) {
		long start, end;
		String[] station = { "광화문", "종로3가", "을지로4가" };

		start = System.nanoTime();
		for (int i = 0; i < station.length; i = i + 1) {
			System.out.println(station[i]);
		}
		end = System.nanoTime();
		System.out.printf("%d nsec\n\n", end - start);

		start = System.nanoTime();
		for (String temp : station)
			System.out.println(temp);
		end = System.nanoTime();
		System.out.printf("%d nsec", end - start);
	}
}
