package exam;

//*모양 찍기
public class Problem2 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i=i+1) {
			if(i<=3) {
				for(int j=1; j<=4-i; j=j+1) {
					System.out.print("*");
				}
				
			}else {
				for(int j=1; j<=i-2;j=j+1) {
					System.out.print("*");
				}
				
			}		System.out.println("");
		}


	}

}
