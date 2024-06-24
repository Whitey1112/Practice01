package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		/*
		 사용자로부터 구의 반지름을 입력받아 구의 부피를 계산하는 프로그램을 작성하세요.
		 
		 */
		
			Scanner ex = new Scanner(System.in);
			
			System.out.print("반지름: ");
			
			
			double r = ex.nextDouble();
			
			double pi = 3.14;
			
			
			System.out.println("구의 부피는: " + 4.0 / 3.0 * pi * r * r * r );
			
			
			System.out.println("");
			
			
			System.out.print("반지름: ");
			
			double r1 = ex.nextDouble();
			
			double pi1 = 3.14;
			
			System.out.println("구의 부피는: " + 4.0 / 3.0 * pi1 * r1 * r1* r1);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			ex.close();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			ex.close();
			
		
	}

}
