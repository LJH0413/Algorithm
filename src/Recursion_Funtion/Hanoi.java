package Recursion_Funtion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hanoi {
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		sb.append( (int) (Math.pow(2, N) - 1 )).append('\n');
		
		Hanoi(N, 1, 2, 3);
		System.out.println(sb);
				
		
		
	}

	/*
	 * N: 원판의 개수
	 * start: 시점, mid: 중간경로, to: 종점
	 */
	
	
	public static void Hanoi(int N, int s, int m, int t) {
		if(N == 1) {
			sb.append(s + " " + t + "\n");
			return;
		}
		
		// N-1개를 A에서 B로 이동
		Hanoi(N-1, s, t, m);
		
		//1개를 A에서 C로 이동: 제일 밑에거
		sb.append(s + " " + t + "\n");
		
		//N-1개를 B에서 C로 이동
		Hanoi(N-1, m, s, t);
		
	}

}
