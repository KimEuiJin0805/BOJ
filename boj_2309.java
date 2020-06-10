package com.boj;

import java.util.Arrays;
import java.util.Scanner;

public class boj_2309 {
	public static void main(String[] args) {
		int arr[] = new int[9];
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		boolean check = false;
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				if(sum - arr[i] - arr[j] == 100)
				{
					arr[i] = 0;
					arr[j] = 0;
					check = true;
					break;
				}
			}
			if(check) break;
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] != 0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
