package com.javaex.practice;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		
		/*
		 사용자에게 연필의 개수와 인원수를 입력받아 모든인원에게 같은수의 연필을 나눠주려고 한다
			1인당 연필의 받을수 있는 연필의 개수와 나머지를 구하시오
		 
		 */
		
		Scanner ex = new Scanner(System.in);
		
		System.out.print("전체 연필 개수를 입력해주세요: ");
		
		int p1 = ex.nextInt();
		
		System.out.print("전체 인원수를 입력해주세요: ");
		
		int p2 = ex.nextInt();
		
		System.out.println("1인당 연필의 갯수는 " + p1 / p2 + "입니다.");
		
		System.out.println("연필의 나머지 갯수는 " + p1 % p2 + " 입니다.");
		
		
		System.out.println("");
		
		
		System.out.print("전체 연필 개수를 입력해주세요: ");
		
		int p3 = ex.nextInt();
		
		System.out.print("전체 인원수를 입력해주세요: ");
		
		int p4 = ex.nextInt();
		
		System.out.println("1인당 연필의 갯수는 " + p3 / p4 + "입니다.");
		
		System.out.println("연필의 나머지 갯수는 " + p3 % p4 + " 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		ex.close();
		
		
		
	}

}
