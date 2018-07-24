package characterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DataMain {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(
				new FileReader(
				"C:\\Java\\java\\access_log.txt"));
			//������ �����Ǹ� �ߺ� ������� �����ϱ� ���� �ڷᱸ��
			ArrayList<String> iplist = new ArrayList<>();
			//�ߺ� ���� �����ϱ� ���� Set �����
			Set<String>ipset = new HashSet<String>();
			while(true) {
				//�� ���� �б�
				String line = br.readLine();
				//���� �����Ͱ� ������ ����
				if(line == null) {
					break;
				}
				//�������� ����
				String []  ar = line.split(" ");
				//System.out.println(ar[0]);
				ipset.add(ar[0]);
				iplist.add(ar[0]);
				
			}
			for(String ip : ipset) {
				System.out.println(ip);
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(br != null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}


	}

}
