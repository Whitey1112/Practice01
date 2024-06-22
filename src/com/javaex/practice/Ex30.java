package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		/*
		 마일을 km로 변환하는 프로그램을 작성하세요.(1마일 = 1.609km 상수로 지정)
		 
		 */
		
		Scanner ex = new Scanner(System.in);
		
		System.out.print("마일을 입력하세요: ");
		
		double mile = ex.nextDouble();
		
		double a = 1.609;
		
		System.out.println(mile + "마일은" + a*mile +"킬로미터 입니다." );
		
		
		System.out.print("마일을 입력하세요: ");
		
		double mile2 = ex.nextDouble();
		
		double b = 1.609;
		
		System.out.println(mile2 + "마일은" + b*mile2 + "킬로미터 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		ex.close();
		
		
	}

}
