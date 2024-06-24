package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		/*
		 상품을 구매하면 정가의 10%를 부가세로 부여한다. 아래와 같이 출력되도록 프로그램을 작성하세요
		 
		 */
		
		Scanner ex = new Scanner(System.in);
		
		
		System.out.print("상품가격: ");
		double pp = ex.nextDouble();
		
		System.out.print("받은 돈: ");
		double mr = ex.nextDouble();
		
		System.out.println("========================");
		
		System.out.println("받은 돈: " + mr);
		System.out.println("상품가격: " + pp);
		System.out.println("부가세:" + pp/10);
		System.out.print("잔액: " + (mr - pp));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		ex.close();
		
		
	}

}
