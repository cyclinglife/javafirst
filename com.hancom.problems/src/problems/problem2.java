package problems;

public class problem2 {
	//���⼭�� GCCG�� ��ġ�� ã�ƶ�

	public static void main(String[] args) {
		String acgt = "ACCGCCGACDGCCGAASASDFBGCCGASDASGCCGASDFGCCGASDFASDFGCCG";
		String codon = "GCCG";
		
		//������ ��ü�� ��ȸ
		for(int i=0; i<acgt.length(); i=i+1) {
			//�ϳ��� ���ڸ� ch�� ����
			char ch = acgt.charAt(i);
			//ch�� codon�� ù��° ���ڰ� ���ٸ�
			if(ch==codon.charAt(0)) {
				//��ġ�� ����
				int idx = i;
				//codon�� �ι�° ���ں��� ������ ��
				int j;				
				for(j=1; j<codon.length(); j=j+1) {
					//���� �ٸ� ���ڰ� ���´ٸ� �ݺ��� ����
					if(acgt.charAt(idx+j)!=codon.charAt(j)) {
						break;
					}
				}
				//�ݺ����� ���������� ����Ǿ��ٸ�
				//��� ���ڰ� �������� �ǹ��ϰ�
				//�� �� j ���� codon�� ���� ���� ����
				if(j==codon.length()) {
					System.out.println(idx);
					// ���� �˻���ġ ����
					// for������ ���ư��� i=i+1�Ǵϱ� �ϳ� �۰� ����
					i=i+codon.length()-1; 
				}
			}
		}
	}
}
