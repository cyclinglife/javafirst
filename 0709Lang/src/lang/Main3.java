package lang;

public class Main3 {
	
	public static void main(String[]args) {
		Integer i = new Integer(10);
		System.out.println(i); //toString()호출
		
		i=20;//Auto Boxing
		System.out.println(i);
		
		i = Integer.parseInt("700");
		System.out.println(i);
		
		//i = Integer.parseInt("8x00"); //NumberFormatException
		//System.out.println(i);
	}

}
