package com.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2884 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str);
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(M >= 45) {
			M = M - 45;
		} else {
			M = 60 - (45 - M);
			if(H == 0) {
				H = 23;
			} else {
				H = H - 1;
			}
		}
		
		System.out.print(H + " " + M);
	}
}
