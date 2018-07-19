package file;

import java.io.File;
import java.sql.Date;

public class FileMain {

	public static void main(String[] args) {
//���Ͽ� ���� ������ Ȯ���� �� �ִ� Ŭ������
		// �ν��Ͻ��� ����
		File f = new File("C:\\JavaProgramming\\15.IO.pptx");
		// ������ ���� ����
		System.out.println(f.exists());
		// ������ ũ��
		long size = f.length();
		System.out.println(size / 1024000 + "MB");
		// ������ ���� �����ð�
		Date date = new Date(f.lastModified());
		System.out.println(date);
		
		File file = new File("C:\\JavaProgramming\\15.IO.pptx");
		String parent = file.getParent();
		String filename = file.getName();
		//filename ���� 15. �� ������ �κ��� ��������
		//.�� ��ġ�� ã�Ƽ� . ������ ���ڿ� ��������
		int idx = filename.indexOf('.');
		//.�� �����Ѵٸ� : ��ġ�� ã�� �޼ҵ��
		//ã���� �ϴ� �����Ͱ� ������ ������ ����
		if(idx >=0) {
			//���ڿ��� ��ġ�� ������ �ڸ��� �޼ҵ�
			//substring : 0��°, 1��° ... idx+1��° ���� �̸� ��������
			filename = filename.substring(idx+1);
		}
		System.out.println(filename);
		
	}

}
