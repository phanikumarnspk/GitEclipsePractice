package com.input.output.basics;

import java.util.Scanner;

public class LengtheOfString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=s.nextLine();//for one word we will take next(),for sentence nextLine()
		int len=str.length();
		System.out.println("length of the String is :"+len);

	}

}
