package Brute_force;

import java.util.Scanner;

public class Nature_Num_Con {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//생성자
		int N = sc.nextInt();
		
		int result = 0;
		
		for(int i=0; i<N; i++) { //1 부터 모두 찾기
			int number = i;
			int sum = 0;
			
			while(number != 0) { //각 자리 수 구하기 (1의 자리, 10의 자리  ...)
				sum += number % 10;
				number /= 10;
			}
			
			//생성자를 찾았을 경우
			if(sum + i == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
		
	}
}
