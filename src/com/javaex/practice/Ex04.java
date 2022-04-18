package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		
		for(int i = 1; i<5; i++) {
			System.out.println(i);
		} //1-4까지 보여질 것으로 예상
		
		System.out.println("===============");
		
		for(int i = 10; i>0; i = i-2) {
			System.out.println(i);
		} //10, 8, 6, 4, 2까지 보여질 것으로 예상

	}

}
