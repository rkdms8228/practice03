package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int y = 0; y<=num; y++) {
			
			for(int x = 1; x<=num-y; x++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			if(y==num) {
				for(int i = 2; i<=num; i++) {
					
					for(int j = 1; j<=i; j++) {
						System.out.print("*");
					}
					
					System.out.println();
					
				}
			}
		}
		
		
		sc.close();

	}

}
