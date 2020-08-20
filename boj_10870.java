package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10870 {
	public static int a(int i) {
		if(i == 0) return 0;
		else if(i == 1) return 1;
		else
			return a(i - 2) + a(i - 1);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(bf.readLine());
		
		System.out.println(a(i));
	}
}
