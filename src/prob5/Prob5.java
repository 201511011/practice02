package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			
			Random random = new Random();
			int number = random.nextInt(10);
			System.out.println(number);
			int mynum=-1;
			
			System.out.println("수를 결정하였습니다 맞춰보세요!!!");
			
			int low=0;
			int up =100;
			int count=1;
			System.out.println(low+"-"+up);
			
//			숫자가 다를 때
			while(mynum!=number){
				
			
					//숫자를 입력받기
					System.out.print(count+">>");
					mynum=scan.nextInt();
					
					//숫자가 클때
					if(mynum>number){
						up=mynum;
						System.out.println(low+"-"+up);
						System.out.println("더 작게");
					}
					
					//숫자가 작을 때 
					if(mynum<number){
						low=mynum;
						System.out.println(low+"-"+up);
						System.out.println("더 크게");
					}
			}	
			
			System.out.println("정답입니다");
			System.out.println();
			System.out.print("다시 하시겠습니까?(y/n)>>");
			String answer = scan.next();
			
			if(answer.equals("y")==false){
				System.out.println("종료합니다");
				break;
			}
			
		}
//			한번 더 
		
		
	
	}
}