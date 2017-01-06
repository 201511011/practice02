package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요>>");
		String s = scan.nextLine();
		
		char[] c = reverse( s );
		printCharArray( c );
		
		scan.close();
	}
	
//	문자열을 뒤집는다
	public static char[] reverse(String  str) {
		
	
		char[] reput = new char[str.length()];
		char[] result = new char[str.length()];
		
		for(int i=0;i<str.length();i++){
			
//			result[i]=reput[(str.length()-1)-i];
			result[i]=str.charAt((str.length()-1)-i);
			
		}
		
		return result;
		
	}

	
//문자열을 출력한다
	public static void printCharArray(char[] array){
		

		for(int i=0; i<array.length;i++){
			System.out.print(array[i]);
		}
	}
}
