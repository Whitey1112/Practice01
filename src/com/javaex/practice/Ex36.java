package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		/*
		 
		 동전별 개수를 입력받아 총금액을 계산하는 프로그램을 작성하세요.
		 */
		
		Scanner ex = new Scanner(System.in);
		
		System.out.print("500원의 개수: ");
		int m1 = ex.nextInt();
		int v1 = m1 * 500;
		
		System.out.print("100원의 개수: ");
		int m2 = ex.nextInt();
		int v2 = m2 * 100;
		
		System.out.print("50원의 개수: ");
		int m3 = ex.nextInt();
		int v3 = m3 * 50;
		
		System.out.print("10원의 개수: ");
		int m4 = ex.nextInt();
		int v4 = m4 * 10;
		
		int result = v1 + v2 + v3 + v4 ; 
		
		System.out.println("동전의 총합은 " + result + " 원 입니다.");
		
		
		System.out.println("");
		
		
		
		
		System.out.print("500원의 개수: ");
		int a1 = ex.nextInt();
		int b1 = a1 * 500;
		
		System.out.print("100원의 개수: ");
		int a2 = ex.nextInt();
		int b2 = a2 * 100;
		
		System.out.print("50원의 개수: ");
		int a3 = ex.nextInt();
		int b3 = a3 * 50;
		
		System.out.print("10원의 개수: ");
		int a4 = ex.nextInt();
		int b4 = a4 * 10;
		
		int result1 = b1 + b2 + b3 + b4 ; 
		
		System.out.println("동전의 총합은 " + result1 + " 원 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		ex.close();
		
		
	}

}
