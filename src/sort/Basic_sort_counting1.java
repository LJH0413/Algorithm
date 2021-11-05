package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basic_sort_counting1 {
	public static void main(String[] args) throws  IOException {
		
		//수의 범위 10000까지
		int[] cnt = new int[10001];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//테스트 케이스 수 입력
		int N = Integer.parseInt(br.readLine());
		
		//입력받은 값의 카운트 추가
		for(int i=0; i<N; i++) {
			cnt[Integer.parseInt(br.readLine())] ++;
		}
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		//1부터 입력 시작
		for(int i=1; i<10001; i++) {
			while(cnt[i] > 0) {
				sb.append(i).append('\n');
				cnt[i]--;
			}
			
		}
		System.out.println(sb);
	}

}
