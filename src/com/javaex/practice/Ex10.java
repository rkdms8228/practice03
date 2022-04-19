package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요.");
			
			Scanner sc = new Scanner(System.in);
			int max = 0;
			int num = 0;
		
			for(int i = 1; i<=5; i++) {
				
				System.out.print("숫자: ");
				num = sc.nextInt();
				
					if(num>max) {
						max = num;
					}
			}
			
			System.out.println("최대값은 "+max+"입니다.");
			
			//*1개의 입력값을 받을 때마다 최대값을 계산해야 함 
			//*다음 입력값이 전의 최대값보다 크면 변경, 작으면 기존 최대값 유지
			
			sc.close();		
				
	}

}
