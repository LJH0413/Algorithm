package sort;

import java.util.Scanner;
import java.util.Arrays;

public class NumberSort {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		char[] arr = sc.nextLine().toCharArray();
		sc.close();
		
		Arrays.sort(arr);
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		
		
	}
}
