package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		for(int y = 1; y<=9; y++) {
			for(int x = 2; x<=9; x++) {
				int sum = x*y;
				System.out.print(x+" * "+y+" = "+sum+"   ");
			}
			System.out.println();
		}

	}

}
