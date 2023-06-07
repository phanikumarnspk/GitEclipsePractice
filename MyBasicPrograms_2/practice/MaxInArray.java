package com.practice;

public class MaxInArray {

	public static void main(String[] args) {
		int arr[]= {20,45,3,7,8,2,4,1};
		int s=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(s<arr[i]) {
				s=arr[i];
			}
		}
			System.out.println(s);

	}

}
