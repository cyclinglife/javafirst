package practice;

public class Main {

	public static void main(String[] args) {
		// obj�ν��Ͻ��� toString ��� ���
		//
		Object obj = new Object();
		System.out.println(obj.toString());
		System.out.println(obj);

		Integer i = 100;
		// toString�� ����� �����ϰ� �ִ� �����ʹ�
		// 100�Դϴ�.
		System.out.println(i.toString());
		System.out.println(i);

		// ���� Ŭ���� Ÿ���� ������ ������
		// ���� Ŭ���� Ÿ���� �ν��Ͻ� ������ ������ �� �ִ�.
		Object str = "Hello World";
		// ��¸� �� ���� ����ȯ ���� ����ص� �˴ϴ�.
		// toString()�� Object�� ������ �����Ƿ�
		// ȣ���� �� �ֱ� �����Դϴ�.
		System.out.println(str);
		//Object Ÿ���� ������ ����� ���� �����ϰ��
		//�Ʒ�ó�� ������ �ڷ������� ���� �� ��ȯ�ؼ� ���
		String temp = (String) str;
		for (int k = 0; k < temp.length(); k = k + 1) {
			System.out.println(temp.charAt(k));
		}
	}

}
