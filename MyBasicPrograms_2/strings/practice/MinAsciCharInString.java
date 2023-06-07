package com.strings.practice;

public class MinAsciCharInString {

	public static void main(String[] args) {
		String str1="bhuvanaBandlaPalli";
		char s=str1.charAt(0);
		
		for(int i=0;i<str1.length();i++) {
			if(((int)s> (int)str1.charAt(i))) {
					s=str1.charAt(i);
					}
			}
		System.out.println(s);
		}
		
			
	}
