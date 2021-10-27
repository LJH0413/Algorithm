package Lab01;

import java.util.Scanner;

public class SnailComeUp {
	
	public static void main(String[] args){
		
	
		Scanner sc = new Scanner(System.in);
		
		int up = sc.nextInt();
		int down = sc.nextInt();
		int miter = sc.nextInt();
		sc.close();
		
		int day = (miter - down) / (up - down);
		
		if((miter - down) % (up - down) != 0) {
			day++;
		}
		System.out.println(day);
		
		/*
		 * day1 (2 - 1) -> 1m
		 * day2 1 + (2-1) -> 2m
		 * day3 2 + (2-1) -> 3m
		 * day4 3 + 2 -> 5m  if(total + day >= miter)
		 * 
		 * day1 5-1 -> 4m
		 * dat2 4+5 -> 6m
		 */
		
		
		
	}

}
