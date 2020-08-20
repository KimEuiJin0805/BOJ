package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10872 {
	
	static void recursion(int num, int k) {
		if(num <= 1) {
			System.out.println(k);
			return;
		}
		else {
			k *= num;
			recursion(num - 1, k);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int k = 1;
		
		recursion(num, k);
	}
}
