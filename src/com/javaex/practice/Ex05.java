package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		
		int i = 1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag = false;
			}
			System.out.println(i);
			i = i+1;
		} //1-5까지 보여질 것으로 예상

	}

}
