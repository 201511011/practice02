package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("돈을 입력하세요:");
		int money=scan.nextInt();
		int fak = money;
		int num=0;
		
		if(fak>0){
//			50000원
			int n1 = fak/50000;
			fak=fak-(n1*50000);
			System.out.println("50000원:"+n1);
//			10000원
			int n2 = fak/10000;
			fak=fak-(n2*10000);
			System.out.println("10000원:"+n2);
//			5000원
			int n3 = fak/5000;
			fak=fak-(n3*5000);
			System.out.println("5000원:"+n3);
//			1000원
			int n4 = fak/1000;
			fak=fak-(n4*1000);
			System.out.println("1000원:"+n4);
//			500원
			int n5 = fak/500;
			fak=fak-(n5*500);
			System.out.println("500원:"+n5);
//			100원
			int n6 = fak/100;
			fak=fak-(n6*100);
			System.out.println("100원:"+n6);
//			10원
			int n7 = fak/10;
			fak=fak-(n7*10);
			System.out.println("10원:"+n7);
//			5원
			int n8 = fak/5;
			fak=fak-(n8*5);
			System.out.println("5원:"+n8);
//			1원
			int n9 = fak/1;
			fak=fak-(n9*1);
			System.out.println("1원:"+n9);
			
		}
	}
}