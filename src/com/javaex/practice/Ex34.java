package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		
		/*
		 [문제] Ex18 사용자로부터 화씨 온도를 입력받아 섭씨 온도로 변환하는 프로그램을 작성하세요.
		 
		 */
		
		Scanner ex = new Scanner(System.in);
		
		System.out.print("화씨는 :");
		
		double F = ex.nextDouble();
		
		System.out.println("화씨 " + F +"의 섭씨온도는 " + 5.0/9.0 * (F - 32) + "입니다.");
		
		
		System.out.println("");
		
		System.out.print("화씨는: ");
		
		double F1 = ex.nextDouble();
		
		System.out.println("화씨 " + F1 +"의 섭씨온도는 " + 5.0/9.0 * (F1 -32) + "입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		ex.close();
		
		
	}

}
