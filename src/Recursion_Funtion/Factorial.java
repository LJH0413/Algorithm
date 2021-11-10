package Recursion_Funtion;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		System.out.println(fact(N));
		
	}

	public static int fact(int i) {
		if(i <= 1) {
			return 1;
		} else {
			return fact(i-1) * i;
		}
	}
}
