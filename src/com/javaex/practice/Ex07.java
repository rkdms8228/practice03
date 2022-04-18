package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		for(int y = 1; y<=num; y++) {
			for(int x = 1; x<=y; x++) {
				System.out.print(y);
			}
			System.out.println();
		} //x로 출력값을 잡게 되면 처음으로 돌아가서 1부터 시작하기 때문에 y로 출력값을 잡아야 함
		
		sc.close();

	}

}
