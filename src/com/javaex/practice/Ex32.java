package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		/*
		 사용자로부터 가로 세로 값을 입력받아 삼각형의 넓이를 구하는 프로그램을 작성하세요
		 
		 */
		
		Scanner ex = new Scanner(System.in);
		
		System.out.print("가로: ");
		double width = ex.nextDouble();
	
		System.out.print("세로: ");
		double height = ex.nextDouble();
		
		System.out.println("삼각형의 넓이는 " + 0.5 * width * height + "입니다.\n");
		
		

		
		System.out.print("가로: ");
		double width1 = ex.nextDouble();
	
		System.out.print("세로: ");
		double height1 = ex.nextDouble();
		
		System.out.println("삼각형의 넓이는: " + 0.5 * width1 * height1 + "입니다.\n");
		
		
		
		
		System.out.print("가로: ");
		double width2 = ex.nextDouble();
	
		System.out.print("세로: ");
		double height2 = ex.nextDouble();
		
		System.out.println("삼각형의 넓이는: "+ 0.5 * width2 * height2 + "입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		ex.close();
		
		
	}

}
