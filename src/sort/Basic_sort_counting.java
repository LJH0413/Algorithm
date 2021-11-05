package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Basic_sort_counting {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//테스트케이스	개수
		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];

		//입력받기
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		} 
		
		//1. 컬랙션의 카운팅 정렬 사용
		//카운팅 정렬
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			sb.append(arr[i]).append('\n');
		}
		System.out.println(sb);

	}

}
