package com.input.output.basics;

import java.util.Scanner;

public class NInputs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=0;
		int sum=0;
		while(i<=n) {
			System.out.println("enter the integer:--");
			int m=sc.nextInt();
			sum=sum+m;
			i=i+1;

		}
		System.out.println("sum of integers:=="+sum);
	}

}
