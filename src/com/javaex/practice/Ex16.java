package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		int five = num/5;
		System.out.println("5의 배수의 개수: "+five);
		
		for(int i = 1; i<=five; i++) {
			sum = (5*i)+sum;
		}
		
		System.out.println("5의 배수의 합: "+sum);
		
		sc.close();

	}

}
