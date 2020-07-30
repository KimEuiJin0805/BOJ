package com.boj;

public class boj_4673 {
	
	static int d(int i) {
		int sum = i;
		while(i > 0) {
			sum += i % 10;
			i /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args){
		boolean[] arr = new boolean[10000];
		
		for(int i = 0; i < 10000; i++) {
			int A = 0;
			A = d(i);
			if(A < 10000)
				arr[A] = true;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10000; i++) {
			if(!arr[i])
				sb.append(i).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
