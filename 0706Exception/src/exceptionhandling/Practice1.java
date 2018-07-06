package exceptionhandling;

public class Practice1 {
	
	public static void main(String[]args) {
		//image0.png, image1.png, image2.png
		//위 3개의 문자열이 1초마다 번갈아가면서 무한반복해서 출력하는 로직
		int idx = 0;
		for(;;) {
			System.out.println(idx%3);
			idx = idx +1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
