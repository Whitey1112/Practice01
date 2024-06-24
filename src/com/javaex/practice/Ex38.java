package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		
		/*
		 총급액을 입력하면 백원단위는 할인을 해주고 있습니다. 실제 지불금액을 출력하는 코드를 작성하세요
		 
		 */
		
		Scanner ex = new Scanner(System.in);
		
		
		System.out.print("전체금액으로 입력해주세요: ");
		
		int m = ex.nextInt();
		
		int result = (m/1000)*1000;
		
		System.out.println("실제지불금액은 " + result + "입니다.");
		
		
		
		System.out.println("");
		
		
		System.out.print("전체금액으로 입력해주세요: ");
		
		int m1 = ex.nextInt();
		
		int result1 = (m1/1000)*1000;
		
		System.out.println("실제지불금액은 " + result1 + "입니다.");
		
		
		System.out.println("");
		
		
		System.out.print("전체금액으로 입력해주세요: ");
		
		int m2 = ex.nextInt();
		
		int result2 = (m2/1000)*1000;
		
		System.out.println("실제지불금액은 " + result2 + "입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		ex.close();
		
		
		
	}

}
