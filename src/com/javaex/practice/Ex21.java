package com.javaex.practice;

public class Ex21 {

	public static void main(String[] args) {
		
		/*
		 아래의 출력결과를 예상하여 작성하세요. Ex20문제와 어느 부분이 다른지 비교해 보세요.
			(코드를 작성해서 예상과 맞는지 확인해 보세요.)
		 
		 정답:11
		 	 1
		 	변수 앞 ++이 붙었을 경우 변수에 바로 +1 해서 출력이 나오지만, 변수 뒤 ++이 붙었을 경우 출력이 먼저 나온 후
		 	변수에 +1이 된다.
		 */
			int i = 10;
			int n = ++i %2;
			
			System.out.println(i);
			System.out.println(n);
	
	}

}
