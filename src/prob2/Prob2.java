package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int intArray[] = new int[5];
		double sum = 0;

		/* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
		/* 배열에 저장된 정수 값 더하기 */
		System.out.println("<<5개의 숫자를 입력하세요>>");
		for(int i=0;i<5;i++){
			System.out.print((i+1)+"번째 숫자 : ");
			intArray[i]=scan.nextInt();
			sum+=intArray[i];
		}
		

		/* 출력 */
		
		double avaerage= sum/intArray.length;
		System.out.println();
		System.out.println("5개 숫자의 평균:"+avaerage);

		/* 자원정리 */
		scan.close();
	}
}
