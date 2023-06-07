package com.input.output.basics;

import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the integer: ");
		int integer=sc.nextInt();
		int sum=0;
		int sum1=0;
		int count=0;
		for(int i=1;i<=integer;i++) {
			if(i%2==0) {
				sum=sum+i;
				count=count+1;
				
			}else {
				sum1=sum1+i;
			}
		}
		System.out.println("cont of even numbers "+count);
		System.out.println("sum of even numbers "+sum);
		System.out.println("sum of odd numbers "+sum1);
	}

}
