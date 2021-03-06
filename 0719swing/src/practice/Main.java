package practice;

public class Main {

	public static void main(String[] args) {
		// obj인스턴스의 toString 결과 출력
		//
		Object obj = new Object();
		System.out.println(obj.toString());
		System.out.println(obj);

		Integer i = 100;
		// toString의 결과가 저장하고 있는 데이터는
		// 100입니다.
		System.out.println(i.toString());
		System.out.println(i);

		// 상위 클래스 타입의 참조형 변수에
		// 하위 클래스 타입의 인스턴스 참조를 대입할 수 있다.
		Object str = "Hello World";
		// 출력만 할 때는 형변환 없이 사용해도 됩니다.
		// toString()은 Object가 가지고 있으므로
		// 호출할 수 있기 때문입니다.
		System.out.println(str);
		//Object 타입의 변수는 출력할 때를 제외하고는
		//아래처럼 원래의 자료형으로 강제 형 변환해서 사용
		String temp = (String) str;
		for (int k = 0; k < temp.length(); k = k + 1) {
			System.out.println(temp.charAt(k));
		}
	}

}
