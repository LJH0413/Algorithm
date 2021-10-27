package Lab01;

import java.util.Scanner;

public class Apartment {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] apt = new int[15][15];
		
		for(int i=0; i<15; i++) {
			apt[i][1] = 1; //i층 1호 = 1
			apt[0][i] = i; //0층 i호 = i
		}
		
		for(int i=1; i<15; i++) { //1층부터 14층까지
			for(int j=2; j<15; j++) { //2호부터 14호까지
				apt[i][j] = apt[i][j-1] + apt[i-1][j];
			}
		}
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(apt[k][n]);
			
		}

	}

}



