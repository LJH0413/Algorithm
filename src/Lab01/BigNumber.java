package Lab01;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BigNumber {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		
		BigInteger a = new BigInteger(st.nextToken());
		BigInteger b = new BigInteger(st.nextToken());
		
		a = a.add(b);
		
		System.out.println(a.toString());
		
//		Scanner sc = new Scanner(System.in);
//		
//		BigInteger bignumber1 = sc.nextBigInteger();
//		BigInteger bignumber2 = sc.nextBigInteger();
//		
//		BigInteger sum = bignumber1.add(bignumber2);
//		
//		System.out.println(sum);
		
		
		
	}

}
