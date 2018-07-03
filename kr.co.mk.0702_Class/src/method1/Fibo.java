package method1;

public class Fibo {

	public static int fiboNoRecursion(int n) {
		int n1 = 1;
		int n2 = 1;
		int result = 1;
		for (int i = 3; i < n + 1; i = i + 1) {
			result = n1 + n2;
			n1 = n2;
			n2 = result;
		}
		return result;

	}

	public static int fiboRecursion(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fiboRecursion(n - 1) + fiboRecursion(n - 2);
		}
	}
}