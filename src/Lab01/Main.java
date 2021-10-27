package Lab01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int x = 0;
		int y = 0;

		while(true) {
			y++;
			x += y;
			if(x>=num) {
				if(y %2 == 0) {
					System.out.println((num-x+y)+"/"+(x-num+1));
				} else {
					System.out.println((x-num+1)+"/"+(num-x+y));
				} 
				break;
			}
		}
	}
}
