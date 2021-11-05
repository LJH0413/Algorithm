package sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class basic_sort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int testcase = sc.nextInt();
		
		ArrayList<Integer> a = new ArrayList<>();
		
		
		for(int i=0; i<testcase; i++) {
			a.add(sc.nextInt());
		} 
		sc.close();
		
		Collections.sort(a);
		
		for(Integer i : a) {
			sb.append(i).append('\n');
		}
		System.out.println(sb);
	}
}
