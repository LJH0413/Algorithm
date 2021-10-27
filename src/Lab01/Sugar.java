package Lab01;

import java.util.Scanner;
public class Sugar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();

		if(d == 4 || d == 7) {
			System.out.println(-1);
		} else if(d % 5 == 0) {
			System.out.println(d / 5);
		} else if(d % 5 == 1 || d % 5 == 3) {
			System.out.println((d/5)+1);
		} else if(d % 5 == 2 || d % 5 == 4) {
			System.out.println((d/5)+2);
		}
	}
}
