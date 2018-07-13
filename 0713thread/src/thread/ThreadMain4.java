package thread;

public class ThreadMain4 {
	public static void main(String[]args) {
		ThreadEx4_Horse th1 = new ThreadEx4_Horse();
		ThreadEx4_Horse th2 = new ThreadEx4_Horse();
		ThreadEx4_Horse th3 = new ThreadEx4_Horse();
		ThreadEx4_Horse th4 = new ThreadEx4_Horse();
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}

}
