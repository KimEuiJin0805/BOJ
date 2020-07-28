package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1110 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		
		int input = Integer.parseInt(str);
		int D, N, newNum;
		int cnt = 0;
		newNum = input;
		
		do {
			if(newNum < 10)
			{
				D = 0;
				N = newNum;
				
				newNum = (N * 10) + ((D + N) % 10);
				cnt++;
			}
			else
			{
				D = newNum / 10;
				N = newNum % 10;
				
				newNum = (N * 10) + ((D + N) % 10);
				cnt++;
			}
		} while(newNum != input);
		
		System.out.println(cnt);
	}
}
