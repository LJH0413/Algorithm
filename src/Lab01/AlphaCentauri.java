package Lab01;

import java.util.Scanner;

public class AlphaCentauri {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int d = y-x;
			
			int max = (int)Math.sqrt(d);
			
			if(max == Math.sqrt(d)) {
				System.out.println(max * 2 - 1);
			} else if(d <= max * max + max) {
				System.out.println(max * 2);
			} else {
				System.out.println(max * 2 + 1);
			}
			
		}
	}

}
