package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2292 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		int cnt = 1, checkNum = 2;
		
		while(checkNum <= num) {
			checkNum += 6*cnt++;
		}
		
		System.out.println(cnt);
	}
}
