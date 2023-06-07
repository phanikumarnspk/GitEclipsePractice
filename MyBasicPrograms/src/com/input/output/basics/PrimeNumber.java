package com.input.output.basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int num1=s.nextInt();
	    int count=0;
		
		for(int i=2;i<num1;i++) {
			
			if(num1%i==0) {
				count=count+1;
			}
		}
		if(count==0) {
			System.out.println(num1+" is prime");
		}
		else {
			System.out.println(num1+" is not prime number");
		}

	}

}
