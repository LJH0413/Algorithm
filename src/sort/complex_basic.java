package sort;

public class complex_basic {
	public static void main(String[] args) {

		/*
		 * 알고리즘의 설계
		 * 시간 제한이 1초인 문제의 경우
			- N의 범위가 500: 시간 복잡도가 O(N³) 알고리즘을 설계하면 문제를 풀 수 있다.
			- N의 범위가 2,000: 시간 복잡도가 O(N²) 알고리즘을 설계하면 문제를 풀 수 있다.
			- N의 범위가 100,000: 시간 복잡도가 O(NlogN) 알고리즘을 설계하면 문제를 풀 수 있다.
			- N의 범위가 10,000,000: 시간 복잡도가 O(N) 알고리즘을 설계하면 문제를 풀 수 있다.
		 */
		
		
		//시간복잡도: Big-O  ->가장빠르게 증가하는 항만 고려
		int[] arr = {1, 2, 3, 4}; //n개의 데이
		int sum = 0;
		
		for(int i : arr) { //arr의 개수 4개만큼 개
			sum += i;
		}
	}

}
