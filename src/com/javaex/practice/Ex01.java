package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("while문");
		int index = 0;
		
		while(index<3) {
			System.out.println("index="+index);
			index++;
		} //index=2까지 반복될 것으로 예상
		
		System.out.println("for문");
		
		for(int order = 0; order<3; order++) {
			System.out.println("order="+order);
		} //order=2까지 반복될 것으로 예상

	}

}
