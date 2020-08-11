package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2839 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int min = 100000;
		
		for(int X = 0, Y = 0, ck = 0; 5 * X <= N; X++) {
			ck = (N - (5 * X));
			if(ck == 0) min = X;
			if(ck % 3 == 0) {
			Y = ck / 3;
			ck = ck -(3 * Y);
				if(ck == 0 && (min > (X + Y))) {
					min = X + Y;
				}
			}
		}
		if(min == 100000)
			System.out.println("-1");
		else
			System.out.println(min);
	}
}
