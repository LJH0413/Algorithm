package sort;

import java.util.Arrays;
import java.util.Scanner;

public class Coordinate2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int[][] c = new int[T][2];

		for(int i=0; i<T; i++) {
			c[i][1] = sc.nextInt();
			c[i][0] = sc.nextInt();
		}

		Arrays.sort(c, (o1, o2) -> {
			if(o1[0] == o2[0]) {
				return o1[1] - o2[1];
			} else {
				return o1[0] - o2[0];
			}
		});

		for(int i=0; i<T; i++) {
			System.out.println(c[i][1] + " " + c[i][0]);
		}
	}


}
