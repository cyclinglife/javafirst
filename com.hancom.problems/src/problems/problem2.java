package problems;

public class problem2 {
	//염기서열 GCCG의 위치를 찾아라

	public static void main(String[] args) {
		String acgt = "ACCGCCGACDGCCGAASASDFBGCCGASDASGCCGASDFGCCGASDFASDFGCCG";
		String codon = "GCCG";
		
		//데이터 전체를 순회
		for(int i=0; i<acgt.length(); i=i+1) {
			//하나씩 글자를 ch에 저장
			char ch = acgt.charAt(i);
			//ch와 codon의 첫번째 글자가 같다면
			if(ch==codon.charAt(0)) {
				//위치를 저장
				int idx = i;
				//codon의 두번째 글자부터 끝까지 비교
				int j;				
				for(j=1; j<codon.length(); j=j+1) {
					//서로 다른 글자가 나온다면 반복문 종료
					if(acgt.charAt(idx+j)!=codon.charAt(j)) {
						break;
					}
				}
				//반복문이 정상적으로 종료되었다면
				//모든 글자가 동일함을 의미하고
				//그 때 j 값은 codon의 글자 수와 같음
				if(j==codon.length()) {
					System.out.println(idx);
					// 다음 검색위치 지정
					// for문으로 돌아가면 i=i+1되니까 하나 작게 설정
					i=i+codon.length()-1; 
				}
			}
		}
	}
}
