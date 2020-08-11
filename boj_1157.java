package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine().toUpperCase();
		int[] cnt = new int[26];
		
		int max = 0;
		int maxIndex = 0;
		
		for(int i = 0; i < str.length(); i++) {
			int num = str.charAt(i);
			cnt[num - 65]++;
		}
		
		for(int i = 0; i < cnt.length; i++) {
			if(max < cnt[i]) {
				max = cnt[i];
				maxIndex = i;
			}
			else if(max == cnt[i]) {
				maxIndex = -1;
			}
		}
		if(maxIndex == -1) {
			System.out.println("?");
		}
		else
			System.out.println((char)(maxIndex + 65));
	}
}
