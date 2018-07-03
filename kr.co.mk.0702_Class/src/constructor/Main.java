package constructor;



public class Main {

	public static void main(String[] args) {
		//Practice 클래스의 인스턴스 생성
		Practice practice1 = new Practice();
		//practice1.setName("noname");
		System.out.println(practice1.getName());
		
		Practice practice2 = new Practice();
		//practice2.setName("noname");
		System.out.println(practice2.getName());

		
		
		String exm = " help document exam ";
		int e = exm.length();
		int t = exm.trim().length();
		System.out.println(e);
		System.out.println(t);
		
		practice2.display();
	}
}
