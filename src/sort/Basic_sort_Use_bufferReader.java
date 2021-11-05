package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Basic_sort_Use_bufferReader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new  BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int testcase = Integer.parseInt(br.readLine());

		ArrayList<Integer> a = new ArrayList<>();


		for(int i=0; i<testcase; i++) {
			a.add(Integer.parseInt(br.readLine()));
		} 

		Collections.sort(a);

		for(Integer i : a) {
			sb.append(i).append('\n');
		}
		System.out.println(sb);
	}


}

//결론: 자료가 많아질 수록 scanner 보다 bufferdreader가 더 빠름
