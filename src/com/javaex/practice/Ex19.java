package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		while(true) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println(" 1.예금 || 2.출금 || 3.잔고 || 4.종료 ");
			System.out.print("선택> ");
			int choose = sc.nextInt();
			
			int dp = 0;
			int wd = 0;
			
			switch(choose) {
				case 1:
					System.out.print("예금액> ");
					int deposit = sc.nextInt();
					dp = deposit;
				case 2:
					System.out.print("출금액> ");
					int withdrawal = sc.nextInt();
					wd = withdrawal;
				case 3:
					int balance = dp-wd;
					System.out.print("잔고액> "+balance);
				case 4:
					System.out.print("프로그램 종료.");
					break;
				default:
					System.out.print("다시 임력해 주세요.");
			}
			
			sc.close();
		}
	}

}
