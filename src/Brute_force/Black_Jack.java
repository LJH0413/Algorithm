package Brute_force;

import java.util.Scanner;

public class Black_Jack {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //카드수
		int m = sc.nextInt(); //블랙
		int sum = 0;
		int temp = 0;
		
		//카드 넘버
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//3중반복문: 3개 카드 수를 더해야 하기 때문에
		for(int i = 0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if(temp < sum && sum <= m) {
						temp = sum;
					}
				}
			}
		}
	}

}
